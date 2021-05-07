package com.example.gymapplication;

import java.util.ArrayList;

public class Utils {
    private  static ArrayList<Training> trainings;
    private static ArrayList<Plan> plans;

    public static void initTrainings() {
        if (null == trainings) {
            trainings = new ArrayList<>();
        }

        Training pushUp = new Training(1, "Push Ups", "An exercise in which a person, keeping a prone position with the hands palms down under the shoulders, the balls of the feet on the ground, and the back straight, pushes the body up and lets it down by an alternate straightening and bending of the arms.",
                "A push-up (sometimes called a press-up in British English) is a common calisthenics exercise beginning from the prone position. By raising and lowering the body using the arms, push-ups exercise the pectoral muscles, triceps, and anterior deltoids, with ancillary benefits to the rest of the deltoids, serratus anterior, coracobrachialis and the midsection as a whole. Push-ups are a basic exercise used in civilian athletic training or physical education and commonly in military physical training. They are also a common form of punishment used in the military, school sport, and some martial arts disciplines.",
                "https://www.google.com/url?sa=i&url=https%3A%2F%2Fweighttraining.guide%2Fexercises%2Fpush-up%2F&psig=AOvVaw20OttO8fpgbj-NNfl_sjOu&ust=1619182260239000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCKi8z5DykfACFQAAAAAdAAAAABAD");
        trainings.add(pushUp);

        Training squat = new Training(2, "Squats", "Crouch or sit with one's knees bent and one's heels close to or touching one's buttocks or the back of one's thighs.",
                "A squat is a strength exercise in which the trainee lowers their hips from a standing position and then stands back up. During the descent of a squat, the hip and knee joints flex while the ankle joint dorsiflexes; conversely the hip and knee joints extend and the ankle joint plantarflexes when standing up.",
                "https://www.google.com/imgres?imgurl=https%3A%2F%2Fi.pinimg.com%2Foriginals%2F6f%2F38%2Fa9%2F6f38a9e3072e903ae1876cc626529ca9.png&imgrefurl=https%3A%2F%2Fwww.pinterest.com%2Fpin%2F493988652873767229%2F&tbnid=5ibHEM1mkzd-ZM&vet=12ahUKEwiQ_Puo85HwAhWBvKQKHURYDcQQMygPegUIARDdAQ..i&docid=EdCbuUzgAnzF9M&w=1320&h=1140&q=squat&hl=ro&ved=2ahUKEwiQ_Puo85HwAhWBvKQKHURYDcQQMygPegUIARDdAQ");
        trainings.add(squat);

        Training legPress = new Training(3, "Leg Press", "An exercise performed by using the legs to press weight away from one's body, while the body remains stationary.",
                "The leg press is a compound weight training exercise in which the individual pushes a weight or resistance away from them using their legs. The term leg press machine refers to the apparatus used to perform this exercise.[1] The leg press can be used to evaluate an athlete's overall lower body strength (from knee joint to hip). It can help to build squat strength.[2] If performed correctly, the inclined leg press can help develop knees to manage heavier free weights,[3] on the other hand, it has the potential to inflict grave injury: the knees could bend the wrong way if they are locked during the exercise.[4]",
                "https://www.google.com/imgres?imgurl=https%3A%2F%2Fi.pinimg.com%2F736x%2F2c%2Fd7%2Fb7%2F2cd7b737081ecdbfed26cbd12fc06937.jpg&imgrefurl=https%3A%2F%2Fza.pinterest.com%2Fpin%2F711428072362330400%2F&tbnid=KJh1TuEaYc3cAM&vet=12ahUKEwjkzoHq85HwAhVBk6QKHaamB50QMygPegUIARDGAQ..i&docid=tS41HGU_khZ2GM&w=665&h=1028&q=leg%20press%20definition&hl=ro&ved=2ahUKEwjkzoHq85HwAhVBk6QKHaamB50QMygPegUIARDGAQ");
        trainings.add(legPress);

        Training pullUp = new Training(4, "Pull Ups", "An exercise in which one hangs by the hands from a support (such as a horizontal bar) and pulls oneself up until the chin is level with the support",
                "A pull-up is an upper-body strength exercise. The pull-up is a closed-chain movement where the body is suspended by the hands and pulls up. As this happens, the elbows flex and the shoulders adduct and extend to bring the elbows to the torso.",
                "https://www.google.com/imgres?imgurl=https%3A%2F%2Fmikereinold.com%2Fwp-content%2Fuploads%2Frookie-mistakes-the-pullup-main-594x442.jpg&imgrefurl=https%3A%2F%2Fmikereinold.com%2Fpull-up-or-chin-up-which-is-better%2F&tbnid=xx_R2X_rRZQtuM&vet=12ahUKEwj9iOie9ZHwAhWC4oUKHe66BaEQMygBegUIARCtAQ..i&docid=qFGpj5cLimAdtM&w=594&h=442&q=pull%20ups%20exercise%20definition&hl=ro&ved=2ahUKEwj9iOie9ZHwAhWC4oUKHe66BaEQMygBegUIARCtAQ");
        trainings.add(pullUp);

        Training calfRaises = new Training(5, "Calf Raises", "An exercise targeting the calf muscle where the subject raises their heel off the ground and lowers it again.",
                "Calf raises are a method of exercising the gastrocnemius, tibialis posterior, peroneals and soleus muscles of the lower leg. The movement performed is plantar flexion, a.k.a. ankle extension.",
                "https://www.google.com/imgres?imgurl=https%3A%2F%2Fwww.dummies.com%2Fwp-content%2Fuploads%2F101309.image0.jpg&imgrefurl=https%3A%2F%2Fwww.dummies.com%2Fhealth%2Fexercise%2Fhow-to-do-the-standing-calf-raise%2F&tbnid=3XYTtAgNXgeZyM&vet=12ahUKEwikq4bh9ZHwAhUYgaQKHb6RCqQQMygHegUIARC9AQ..i&docid=1_utQBMlG95zQM&w=535&h=383&q=calf%20raises%20definition&hl=ro&ved=2ahUKEwikq4bh9ZHwAhUYgaQKHb6RCqQQMygHegUIARC9AQ");
        trainings.add(calfRaises);
    }

    public static ArrayList<Training> getTrainings() {
        return trainings;
    }

    public static boolean addPlan(Plan plan) {
        if (null == plans) {
            plans = new ArrayList<>();
        }
        return plans.add(plan);
    }

    public static ArrayList<Plan> getPlans() {
        return plans;
    }
}
