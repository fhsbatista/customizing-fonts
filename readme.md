Aplicando uma fonte como fonte padrão para todo o projeto
 - Criar uma pasta do tipo "Android resource directory" do type "font", com o nome "font" dentro de "res"
 - Colocar a fonte que deve ficar como padrão dentro desta pasta
 - Se necessário, criar um arquivo "fontFamily"
 - Sobreescrever o atributo "android:fontFamily" no style que funciona como default do projeto, passando a fonte ou o fontFamily desejado
 - Desta forma, a nova fonte irá substituir a roboto como fonte padrão.

Setting a custom font into a specific place programmatically.
 - Para fazer isto, devemos setar o "typeface" do textview, passando um typeface resource
 - O typeface, podemos conseguir através do Typeface.createFromAsset, passando o context da textview que queremos personalizar, e o nome da fonte
 - A fonte deve estar em uma pasta chamada "assets", dentro da pasta do projeto (main por exemplo)

 Usando a nova API do android oreo
  - criar um "Android resource directory" de resource type "font", com o nome "font" dentro de "res"