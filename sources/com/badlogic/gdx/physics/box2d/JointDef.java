package com.badlogic.gdx.physics.box2d;

/* JADX INFO: loaded from: classes.dex */
public class JointDef {
    public JointType type = JointType.Unknown;
    public Body bodyA = null;
    public Body bodyB = null;
    public boolean collideConnected = false;

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 com.badlogic.gdx.physics.box2d.JointDef$JointType, still in use, count: 1, list:
  (r0v0 com.badlogic.gdx.physics.box2d.JointDef$JointType) from 0x0084: FILLED_NEW_ARRAY 
  (r0v0 com.badlogic.gdx.physics.box2d.JointDef$JointType)
  (r1v1 com.badlogic.gdx.physics.box2d.JointDef$JointType)
  (r3v1 com.badlogic.gdx.physics.box2d.JointDef$JointType)
  (r5v1 com.badlogic.gdx.physics.box2d.JointDef$JointType)
  (r7v1 com.badlogic.gdx.physics.box2d.JointDef$JointType)
  (r9v1 com.badlogic.gdx.physics.box2d.JointDef$JointType)
  (r11v1 com.badlogic.gdx.physics.box2d.JointDef$JointType)
  (r13v1 com.badlogic.gdx.physics.box2d.JointDef$JointType)
  (r15v1 com.badlogic.gdx.physics.box2d.JointDef$JointType)
  (r14v3 com.badlogic.gdx.physics.box2d.JointDef$JointType)
  (r12v3 com.badlogic.gdx.physics.box2d.JointDef$JointType)
  (r10v3 com.badlogic.gdx.physics.box2d.JointDef$JointType)
 A[WRAPPED] (LINE:133) elemType: com.badlogic.gdx.physics.box2d.JointDef$JointType
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class JointType {
        Unknown(0),
        RevoluteJoint(1),
        PrismaticJoint(2),
        DistanceJoint(3),
        PulleyJoint(4),
        MouseJoint(5),
        GearJoint(6),
        WheelJoint(7),
        WeldJoint(8),
        FrictionJoint(9),
        RopeJoint(10),
        MotorJoint(11);

        public static JointType[] valueTypes = {new JointType(0), new JointType(1), new JointType(2), new JointType(3), new JointType(4), new JointType(5), new JointType(6), new JointType(7), new JointType(8), new JointType(9), new JointType(10), new JointType(11)};
        private int value;

        static {
        }

        private JointType(int i) {
            super(str, i);
            this.value = i;
        }

        public static JointType valueOf(String str) {
            return (JointType) Enum.valueOf(JointType.class, str);
        }

        public static JointType[] values() {
            return (JointType[]) $VALUES.clone();
        }

        public int getValue() {
            return this.value;
        }
    }
}
