public class Main {
    public static void main(String[] args) {
        Java java1 = new Java("Ndes", 32, 'M', "ersf@gmail.com");
        Java java2 = new Java("Jonathan", 23, 'F', "joni@gmail.com");
        Java java3 = new Java("Kevin", 40, 'M', "kivik@gmail.com");
        Java java4 = new Java("Deisi", 28, 'F', "deizi43@gmail.com");
        Java java5 = new Java("Erbol", 19, 'M', "zholborsov559@gmail.com");

        Java[] javas1 = {java1, java2, java3, java4, java5};

        Java java11 = new Java("Kairat", 18, 'M', "kairatakanar@gmail.com");
        Java java12 = new Java("Aizat", 20, 'F', "duisheeva12@gmail.com");

        Java[] javas2 = {java11, java12};

        Android android1 = new Android("Nurseit", 17, 'M', "nursi@gmail.com");
        Android android2 = new Android("Eldan", 18, 'M', "eldanbekk@gmail.com");
        Android android3 = new Android("Datka", 22, 'F', "kurmanjandatka@gmail.com");

        Android[] androids1 = {android1, android2, android3};

        Android android11 = new Android("Osmon", 18, 'M', "osmonimanbekov@gmail.com");

        Android[]androids2={android11};

        Go go1 = new Go("Tursunai", 21, 'F', "tratata@gmail.com");
        Go go2 = new Go("Ainazik", 19, 'F', "aizi23@gmail.com");

        Go[] gos1 = {go1, go2};

        Go go11 = new Go("Ainazik", 19, 'F', "aizi23@gmail.com");

        Go[] gos2 = {go11};
        Company company1 = new Company("Bill Gates", "America", javas1, androids1, gos1);
        Company company2 = new Company("Jeff Bezis", "Europe", javas2, androids2,gos2);
        System.out.println("1 - company: "+company1+"\n");
        System.out.println("2 - company: "+company2);

    }
}