<h2> Questões </h2><br>

<h4> 1) Quais os valores de saída se atribuirmos a=1, b= - 13 e c=40? </h4> 
<p>x1= 8.0 // x2= 5.0</p> <br>
<h4> 2) Quais os valores de saída se atribuirmos a=1, b=1 e c=1? </h4>
<p>x1= NaN // x2= NaN</p> <br>
<h4> 3) Qual o nome da classe que determina as raízes de uma equação do segundo grau? </h4>
<p>Eq2Grau</p> <br>
<h4> 4) Qual o nome da classe que instancia um objeto da classe Eq2Grau? </h4>
<p>Proj_Eq2Grau</p> <br>
<h4> 5) Qual o nome do objeto instanciado? </h4>
<p>eq</p> <br>
<h4> 6) Todos os métodos implementados na classe Eq2Grau foram utilizados nesta aula? Por que? </h4>
<p> Não, pois não foi necessário utilizar o métodos getDelta(), getA(), getB() e getC() </p> <br>
<h4> 7) Quantos objetos foram utilizados nesta aula? </h4>
<p> 1 objeto </p> <br>
<h4> 8) Qual(is) seu(s) nome(s)? </h4>
<p> eq </p> <br>
<h4> 9) Quais os métodos da classe Eq2Grau que foram utilizados nesta aula? </h4>
<p> setA(), setB(), setC(), calcularDelta(), calcularX1(), calcularX2(), getX1(), getX2() </p> <br>
 
<h2> Desafios </h2><br>

<h4> Desafio1: Implementar a classe Eq2Grau / Proj_Eq2Grau capacitando-a a manipular raízes complexas. </h4> <br>


    public void calcularX1() {
        if (delta < 0) {
            double newDelta = (delta * -1);
            x1 = (-b + Math.sqrt(newDelta)) / (2 * a);

        } else {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
        }
    }

    public void calcularX2() {
        if (delta < 0) {
            double newDelta = (delta * -1);
            x2 = (-b - Math.sqrt(newDelta)) / (2 * a);

        } else {
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
        }
    }


<br>
<h4> Desafio2: Implementar a classe Eq2Grau / Proj_Eq2Grau capacitando-a para resolver o mesmo problema, porém sem o atributo delta. </h4> <br>


    public void calcularX1NoDelta() {
        if ((b * b - 4 * a * c) < 0) {
            x1 = (-b + Math.sqrt((b * b - 4 * a * c) * -1)) / (2 * a);
        } else {
            System.out.println("else " + getA());
            x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        }
    }

    public void calcularX2NoDelta() {
        if ((b * b - 4 * a * c) < 0) {
            x2 = (-b - Math.sqrt((b * b - 4 * a * c) * -1)) / (2 * a);

        } else {
            x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        }
    }

<br>
<h4> Desafio 3: Por qual motivo não foi implementado métodos “sets” para os atributos delta, x1 e x2? </h4> <br>
<p> Porque esses atributos são calculados dentro da classe Eq2Grau e não são incluídos pelo usuário. Garantindo o encapsulamento </p> <br>
