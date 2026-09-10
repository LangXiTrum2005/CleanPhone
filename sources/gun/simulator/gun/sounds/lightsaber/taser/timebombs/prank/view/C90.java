package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;

/* JADX INFO: loaded from: classes4.dex */
public final class C90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EnumC5106yW f2913a;
    public final int b;
    public final String c;

    public C90(EnumC5106yW enumC5106yW, int i, String str) {
        AbstractC2995aW.q(enumC5106yW, "protocol");
        AbstractC2995aW.q(str, PglCryptUtils.KEY_MESSAGE);
        this.f2913a = enumC5106yW;
        this.b = i;
        this.c = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f2913a == EnumC5106yW.HTTP_1_0) {
            sb.append("HTTP/1.0");
        } else {
            sb.append("HTTP/1.1");
        }
        sb.append(' ');
        sb.append(this.b);
        sb.append(' ');
        sb.append(this.c);
        String string = sb.toString();
        AbstractC2995aW.p(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
