package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Be, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2307Be {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f2881a;
    public static final Charset b;
    public static final Charset c;
    public static volatile Charset d;
    public static volatile Charset e;

    static {
        Charset charsetForName = Charset.forName(com.mbridge.msdk.playercommon.exoplayer2.C.UTF8_NAME);
        AbstractC2995aW.p(charsetForName, "forName(\"UTF-8\")");
        f2881a = charsetForName;
        AbstractC2995aW.p(Charset.forName(com.mbridge.msdk.playercommon.exoplayer2.C.UTF16_NAME), "forName(\"UTF-16\")");
        Charset charsetForName2 = Charset.forName("UTF-16BE");
        AbstractC2995aW.p(charsetForName2, "forName(\"UTF-16BE\")");
        b = charsetForName2;
        AbstractC2995aW.p(Charset.forName("UTF-16LE"), "forName(\"UTF-16LE\")");
        AbstractC2995aW.p(Charset.forName(com.mbridge.msdk.playercommon.exoplayer2.C.ASCII_NAME), "forName(\"US-ASCII\")");
        Charset charsetForName3 = Charset.forName("ISO-8859-1");
        AbstractC2995aW.p(charsetForName3, "forName(\"ISO-8859-1\")");
        c = charsetForName3;
    }
}
