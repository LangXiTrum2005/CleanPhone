package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class QT {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final QT f3603a;
    public static final QT b;
    public static final QT[] c;
    public static final /* synthetic */ QT[] d;

    static {
        QT qt = new QT("fixed", 0);
        f3603a = qt;
        QT qt2 = new QT("percent", 1);
        b = qt2;
        d = new QT[]{qt, qt2};
        c = values();
    }

    public static QT valueOf(String str) {
        return (QT) Enum.valueOf(QT.class, str);
    }

    public static QT[] values() {
        return (QT[]) d.clone();
    }
}
