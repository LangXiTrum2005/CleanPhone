package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'NEW' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes4.dex */
public abstract class B1 {
    private static final /* synthetic */ B1[] $VALUES = $values();
    public static final B1 ERROR;
    public static final B1 FINISHED;
    public static final B1 LOADING;
    public static final B1 NEW;
    public static final B1 PLAYING;
    public static final B1 READY;

    private static final /* synthetic */ B1[] $values() {
        return new B1[]{NEW, LOADING, READY, PLAYING, FINISHED, ERROR};
    }

    static {
        final String str = "NEW";
        final int i = 0;
        NEW = new B1(str, i) { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.y1
            {
                AbstractC2471Hm abstractC2471Hm = null;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.B1
            public boolean canTransitionTo(B1 b1) {
                AbstractC2995aW.q(b1, "adState");
                return b1 == B1.LOADING || b1 == B1.READY || b1 == B1.ERROR;
            }
        };
        final String str2 = "LOADING";
        final int i2 = 1;
        LOADING = new B1(str2, i2) { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.x1
            {
                AbstractC2471Hm abstractC2471Hm = null;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.B1
            public boolean canTransitionTo(B1 b1) {
                AbstractC2995aW.q(b1, "adState");
                return b1 == B1.READY || b1 == B1.ERROR;
            }
        };
        final String str3 = "READY";
        final int i3 = 2;
        READY = new B1(str3, i3) { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.A1
            {
                AbstractC2471Hm abstractC2471Hm = null;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.B1
            public boolean canTransitionTo(B1 b1) {
                AbstractC2995aW.q(b1, "adState");
                return b1 == B1.PLAYING || b1 == B1.FINISHED || b1 == B1.ERROR;
            }
        };
        final String str4 = "PLAYING";
        final int i4 = 3;
        PLAYING = new B1(str4, i4) { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.z1
            {
                AbstractC2471Hm abstractC2471Hm = null;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.B1
            public boolean canTransitionTo(B1 b1) {
                AbstractC2995aW.q(b1, "adState");
                return b1 == B1.FINISHED || b1 == B1.ERROR;
            }
        };
        final String str5 = "FINISHED";
        final int i5 = 4;
        FINISHED = new B1(str5, i5) { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.w1
            {
                AbstractC2471Hm abstractC2471Hm = null;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.B1
            public boolean canTransitionTo(B1 b1) {
                AbstractC2995aW.q(b1, "adState");
                return false;
            }
        };
        final String str6 = "ERROR";
        final int i6 = 5;
        ERROR = new B1(str6, i6) { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.v1
            {
                AbstractC2471Hm abstractC2471Hm = null;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.B1
            public boolean canTransitionTo(B1 b1) {
                AbstractC2995aW.q(b1, "adState");
                return b1 == B1.FINISHED;
            }
        };
    }

    public /* synthetic */ B1(String str, int i, AbstractC2471Hm abstractC2471Hm) {
        this(str, i);
    }

    public static B1 valueOf(String str) {
        return (B1) Enum.valueOf(B1.class, str);
    }

    public static B1[] values() {
        return (B1[]) $VALUES.clone();
    }

    public abstract boolean canTransitionTo(B1 b1);

    public final boolean isTerminalState() {
        return AbstractC2340Cl.K(FINISHED, ERROR).contains(this);
    }

    public final B1 transitionTo(B1 b1) {
        AbstractC2995aW.q(b1, "adState");
        if (this != b1 && !canTransitionTo(b1)) {
            String str = "Cannot transition from " + name() + " to " + b1.name();
            if (Q1.THROW_ON_ILLEGAL_TRANSITION) {
                throw new IllegalStateException(str);
            }
            C4917wJ.Companion.e("AdInternal", "Illegal state transition", new IllegalStateException(str));
        }
        return b1;
    }

    private B1(String str, int i) {
        super(str, i);
    }
}
