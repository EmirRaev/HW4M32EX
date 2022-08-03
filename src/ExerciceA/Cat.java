package ExerciceA;

public class Cat {
private CatName catName;
private int chooseName;

    public Cat(int chooseName) {
        this.chooseName = chooseName;
        if(chooseName == 1) {
            this.catName = CatName.ALICA;
        }
        else if(chooseName == 2) {
            this.catName = CatName.TOM;
        }
        else if(chooseName == 3) {
            this.catName = CatName.ROCKI;
        }

    }
}
