# SD-ControleConcorrenciaJava

## 1. Sem Sincronização (Pasta "Concorrente")
    Descrição:
    A implementação inicial não utiliza qualquer tipo de controle de sincronização para acesso à conta.
    Funcionamento:
    Vários membros da família (threads) tentam sacar de uma conta compartilhada.
    Como não há controle, há possibilidade de condições de corrida, levando a erros como saques acima do saldo disponível.
    Risco:
    Resultados inconsistentes devido à ausência de mecanismos para gerenciar acessos simultâneos.
## 2. Com Lock (Pasta "Lock")
    Descrição:
    Uso da classe ReentrantLock para proteger as operações de saque e acesso ao saldo.
    Funcionamento:
    Lock é utilizado para garantir que apenas uma thread possa acessar ou modificar o saldo por vez.
    Métodos como getSaldo, setSaldo, e debitarValor são protegidos com o lock.
    Vantagem:
    Reduz as condições de corrida, garantindo consistência nos saques.
    É mais flexível do que synchronized para cenários mais complexos.
## 3. Com ReadWriteLock (Pasta "RwLock")
    Descrição:
    Uso de ReadWriteLock para diferenciar acessos de leitura e escrita.
    Funcionamento:
    Operações de leitura (getSaldo) utilizam o readLock, permitindo acesso simultâneo por múltiplas threads.
    Operações de escrita (setSaldo e debitarValor) utilizam o writeLock, garantindo exclusividade.
    Vantagem:
    Melhor desempenho em cenários com muitas leituras e poucas escritas.
## 4. Com synchronized (Pasta "Synk")
    Descrição:
    Uso de blocos sincronizados com a palavra-chave synchronized.
    Funcionamento:
    Métodos que acessam ou modificam o saldo são declarados como synchronized.
    Isso garante que apenas uma thread acesse esses métodos por vez.
    Vantagem:
    Simplicidade e integração direta com a linguagem Java.
    Boa opção para casos mais simples.
