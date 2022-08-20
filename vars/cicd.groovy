def newGit(repo)
{
  git "${repo}"
}
def newMaven()
{
  sh 'mvn package'
}
def newDeploy(ip,appname)
{
  deploy adapters: [tomcat9(credentialsId: '4a198297-7196-45d6-9475-249fcb77e483', path: '', url:"$(ip)"], contextPath:"$(appname)", war: '**/*.war'
}
