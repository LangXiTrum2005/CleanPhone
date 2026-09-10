package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.yZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C5109yZ {
    public static final C4933wZ Companion = new C4933wZ(null);
    private final Object body;
    private final CZ errorBody;
    private final C5021xZ rawResponse;

    public /* synthetic */ C5109yZ(C5021xZ c5021xZ, Object obj, CZ cz, AbstractC2471Hm abstractC2471Hm) {
        this(c5021xZ, obj, cz);
    }

    public final Object body() {
        return this.body;
    }

    public final int code() {
        return this.rawResponse.d;
    }

    public final CZ errorBody() {
        return this.errorBody;
    }

    public final C4447qz headers() {
        return this.rawResponse.f;
    }

    public final boolean isSuccessful() {
        return this.rawResponse.k();
    }

    public final String message() {
        return this.rawResponse.c;
    }

    public final C5021xZ raw() {
        return this.rawResponse;
    }

    public String toString() {
        return this.rawResponse.toString();
    }

    private C5109yZ(C5021xZ c5021xZ, Object obj, CZ cz) {
        this.rawResponse = c5021xZ;
        this.body = obj;
        this.errorBody = cz;
    }
}
