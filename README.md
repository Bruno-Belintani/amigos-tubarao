# amigos-tubarao

# Versão Atual: 1.0.0

### Como contruibuir no projeto

  1. Crie uma branch a partir da main.
  2. Crie um PR e solicite aos devs revisar e mergear com a branch main.

### Como versionar o projeto:

Dado um número de versão MAJOR.MINOR.PATCH, incremente o:

Versão `MAJOR` quando você faz alterações de API incompatíveis (Grandes alterações).
Versão `MINOR` quando você adiciona funcionalidade de maneira compatível com versões anteriores.
Versão `PATCH` quando você faz correções de bugs compatíveis com versões anteriores.

### Como fazer commit nesse projeto

Veja como uma pequena alteração em seu estilo de mensagem de commit pode torná-lo um programador melhor.

Formato: `<type>(<scope>): <subject>`

`<scope>` is optional

## Exemplo

```
feat: add hat wobble
^--^  ^------------^
|     |
|     +-> Resumo no tempo presente.
|
+-------> Type: chore, docs, feat, fix, refactor, style, or test.
```

Mais exemplos

O commit semântico possui os elementos estruturais abaixo (tipos), que informam a intenção do seu commit ao utilizador(a) de seu código.

- `feat`- Commits do tipo feat indicam que seu trecho de código está incluindo um **novo recurso** (se relaciona com o MINOR do versionamento semântico).

- `fix` - Commits do tipo fix indicam que seu trecho de código commitado está **solucionando um problema** (bug fix), (se relaciona com o PATCH do versionamento semântico).

- `docs` - Commits do tipo docs indicam que houveram **mudanças na documentação**, como por exemplo no Readme do seu repositório. (Não inclui alterações em código).

- `test` - Commits do tipo test são utilizados quando são realizadas **alterações em testes**, seja criando, alterando ou excluindo testes unitários. (Não inclui alterações em código)

- `style` - Commits do tipo style indicam que houveram alterações referentes a **formatações de código**, semicolons, trailing spaces, lint... (Não inclui alterações em código).

- `refactor` - Commits do tipo refactor referem-se a mudanças devido a **refatorações que não alterem sua funcionalidade**, como por exemplo, uma alteração no formato como é processada determinada parte da tela, mas que manteve a mesma funcionalidade, ou melhorias de performance devido a um code review.

- `chore` - Commits do tipo chore indicam **atualizações de tarefas** de build, configurações de administrador, pacotes... como por exemplo adicionar um pacote no gitignore. (Não inclui alterações em código)

References:

- https://raw.githubusercontent.com/iuricode/padroes-de-commits/main/README.md
- https://semver.org/
