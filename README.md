![Saint Seiya Wallpaper](https://img.ibxk.com.br/2017/11/27/27171512909346.jpg?w=1120&h=420&mode=crop&scale=both)


---
# ![Icon](https://styles.redditmedia.com/t5_xy3ru/styles/communityIcon_radt7oe4fpo31.png) Saint Seiya API
---
> Projeto com finalidade de apresentar os conteúdos apresentados em aula sobre REST com Spring Boot, a ideia do projeto consiste em implementar interfaces e classes abstratas codadas em Java, com a intenção de cadastrar, alterar e remover um cavaleiro ou Deus de um santuário dentro de suas respectivas classes.
---
## ![Icon](https://styles.redditmedia.com/t5_xy3ru/styles/communityIcon_radt7oe4fpo31.png) Razões de Saint Seiya ter sido escolhido para esse projeto.

 - Sou fã de carteirinha da obra;
 - Desde pequeno, esse anime me mostrou os valores da amizade, aprendi que o trabalho em equipe é valioso;
 - Acredito que futuramente eu consiga fazer uma API para fãs e para quem gostaria de conhecer a obra, desejo desenvolver minha própria;

---

## ![Icon](https://styles.redditmedia.com/t5_xy3ru/styles/communityIcon_radt7oe4fpo31.png) Entendendo a aplicação:
> Decidi utilizar de uma interface e classe abstrata conforme fora proposto pela faculdade de tecnologia, BandTec. A aplicação na qual implementei minha regra de negócio visa em calcular o poder em velocidade mach e o poder de cosmo de cada cavaleiro/Deus, esses métodos foram utilizados como assinatura na classe abstrata, como método abstrado, dessa forma as outras classes poderiam herdar de todos os cálculos e assim sendo, tendo tuas particularidades por cada patente de personagens;
> A interface utilizada, depois de tantas versões, estruturas e complexidade do que eu poderia implementar nas demais classes, teve sua versão final e melhor estruturada assim que notei que a melhor maneira de utilizar da mesma seria fazendo o CRUD, no qual poderia controlar com maior facilidade nas classes onde a Controller fora implementada;
> Utilizei de injeção de dependências com spring, dessa forma pego as informações da classe na qual implementa uma lista Santuário (classe na qual arquiva todos seus personagens em seus respectivos santuários) com outra classe chamada de Localidade, classe na qual buscaria todos os santuários cadastrados. Dessa forma, a API fará com que a controller busque a partir da classe localidade todas as posteriores, porém não acaba aqui, fora preciso uma segunda Controller, essa na qual adicionava todos os personagens inseridos, por fim as duas implementam os métodos CRUD citados da interface, colocando uma lista dentro de outra;


###### Queime seu cosmo até o limite! 🌌 

