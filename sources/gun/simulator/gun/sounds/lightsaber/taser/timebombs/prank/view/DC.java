package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes3.dex */
public final class DC {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f2960a;
    public final Object b;
    public final Object c;

    public DC(Object obj, Object obj2, Object obj3) {
        this.f2960a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f2960a;
        String strValueOf = String.valueOf(obj);
        String strValueOf2 = String.valueOf(this.b);
        String strValueOf3 = String.valueOf(obj);
        String strValueOf4 = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(strValueOf4.length() + strValueOf3.length() + strValueOf2.length() + strValueOf.length() + 39);
        sb.append("Multiple entries with same key: ");
        sb.append(strValueOf);
        sb.append("=");
        sb.append(strValueOf2);
        return new IllegalArgumentException(DM.n(sb, " and ", strValueOf3, "=", strValueOf4));
    }
}
