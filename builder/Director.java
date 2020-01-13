package partten.builder;

public class Director {

    public void builderPeople(BuilderPeopleInterface builderPeople) {
        builderPeople.builderHeader();
        builderPeople.builderBody();
        builderPeople.builderLeftHand();
        builderPeople.builderRightHand();
        builderPeople.builderRightLeg();
        builderPeople.builderLeftLeg();
    }
}
