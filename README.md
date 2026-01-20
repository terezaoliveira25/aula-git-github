
# 📘 Tutorial de Git e GitHub (Comandos Essenciais)

Este guia apresenta os principais comandos do **Git** usados no versionamento de código e na integração com o **GitHub**.

---

## 📌 O que é Git?

Git é um **sistema de controle de versão distribuído**, usado para rastrear mudanças no código-fonte durante o desenvolvimento de software.

## 🌐 O que é GitHub?

GitHub é uma **plataforma online** que hospeda repositórios Git, permitindo colaboração, backup e gerenciamento de código.

---

## ⚙️ Configuração Inicial do Git

### Configurar nome de usuário

```bash
git config --global user.name "Seu Nome"
```

### Configurar e-mail

```bash
git config --global user.email "seuemail@email.com"
```

### Ver configurações

```bash
git config --list
```

---

## 📂 Criando um Repositório

### Inicializar um repositório local

```bash
git init
```

### Clonar um repositório do GitHub

```bash
git clone https://github.com/usuario/repositorio.git
```

---

## 📄 Status e Histórico

### Ver status dos arquivos

```bash
git status
```

### Ver histórico de commits

```bash
git log
```

### Log resumido

```bash
git log --oneline
```

---

## ➕ Adicionando Arquivos

### Adicionar um arquivo específico

```bash
git add arquivo.txt
```

### Adicionar todos os arquivos

```bash
git add .
```

---

## 💾 Commitando Alterações

### Criar um commit

```bash
git commit -m "Mensagem descritiva do commit"
```

> 💡 **Dica:** Use mensagens claras e objetivas.

---

## 🌿 Trabalhando com Branches

### Listar branches

```bash
git branch
```

### Criar nova branch

```bash
git branch nome-da-branch
```

### Mudar de branch

```bash
git checkout nome-da-branch
```

### Criar e mudar de branch ao mesmo tempo

```bash
git checkout -b nome-da-branch
```

### Mesclar branch com a branch atual

```bash
git merge nome-da-branch
```

---

## 🔗 Conectando ao GitHub

### Adicionar repositório remoto

```bash
git remote add origin https://github.com/usuario/repositorio.git
```

### Ver repositórios remotos

```bash
git remote -v
```

---

## ⬆️ Enviando Código para o GitHub

### Enviar commits para o repositório remoto

```bash
git push origin main
```

> ⚠️ Dependendo do projeto, a branch principal pode ser `main` ou `master`.

---

## ⬇️ Atualizando Código Local

### Baixar atualizações do repositório remoto

```bash
git pull origin main
```

---

## 🗑️ Desfazendo Alterações

### Desfazer alterações em arquivo não commitado

```bash
git checkout -- arquivo.txt
```

### Remover arquivo do stage

```bash
git reset arquivo.txt
```

### Voltar para um commit anterior (atenção!)

```bash
git reset --hard HASH_DO_COMMIT
```

---

## 📁 Ignorando Arquivos com `.gitignore`

Exemplo de `.gitignore`:

```gitignore
node_modules/
.env
*.log
```

---

## ✅ Fluxo Básico de Trabalho

```bash
git status
git add .
git commit -m "Descrição da alteração"
git push origin main
```

---

## 📚 Recursos Úteis

* Documentação oficial: [https://git-scm.com/doc](https://git-scm.com/doc)
* GitHub Docs: [https://docs.github.com/](https://docs.github.com/)

