on: push
name: deploy
jobs:
  deploy:
    name: deploy to cluster
    runs-on: ubuntu-latest
    steps:
    - uses: actions/checkout@master
    - name: build and push to docker
    - run: mvn spring-boot:run      
