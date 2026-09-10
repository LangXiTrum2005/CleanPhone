package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public abstract class NY {
    public static final MY Companion = new MY();

    public static final NY create(C3971lc c3971lc, RO ro) {
        Companion.getClass();
        AbstractC2995aW.q(c3971lc, "<this>");
        return new KY(ro, c3971lc, 1);
    }

    public abstract long contentLength();

    public abstract RO contentType();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    public abstract void writeTo(InterfaceC2434Gb interfaceC2434Gb);

    public static final NY create(RO ro, C3971lc c3971lc) {
        Companion.getClass();
        AbstractC2995aW.q(c3971lc, "content");
        return new KY(ro, c3971lc, 1);
    }

    public static final NY create(RO ro, File file) {
        Companion.getClass();
        AbstractC2995aW.q(file, "file");
        return new KY(ro, file, 0);
    }

    public static final NY create(RO ro, String str) {
        Companion.getClass();
        AbstractC2995aW.q(str, "content");
        return MY.a(str, ro);
    }

    public static final NY create(RO ro, byte[] bArr) {
        MY my = Companion;
        my.getClass();
        AbstractC2995aW.q(bArr, "content");
        return MY.c(my, ro, bArr, 0, 12);
    }

    public static final NY create(RO ro, byte[] bArr, int i) {
        MY my = Companion;
        my.getClass();
        AbstractC2995aW.q(bArr, "content");
        return MY.c(my, ro, bArr, i, 8);
    }

    public static final NY create(RO ro, byte[] bArr, int i, int i2) {
        Companion.getClass();
        AbstractC2995aW.q(bArr, "content");
        return MY.b(bArr, ro, i, i2);
    }

    public static final NY create(File file, RO ro) {
        Companion.getClass();
        AbstractC2995aW.q(file, "<this>");
        return new KY(ro, file, 0);
    }

    public static final NY create(String str, RO ro) {
        Companion.getClass();
        return MY.a(str, ro);
    }

    public static final NY create(byte[] bArr) {
        MY my = Companion;
        my.getClass();
        AbstractC2995aW.q(bArr, "<this>");
        return MY.d(my, bArr, null, 0, 7);
    }

    public static final NY create(byte[] bArr, RO ro) {
        MY my = Companion;
        my.getClass();
        AbstractC2995aW.q(bArr, "<this>");
        return MY.d(my, bArr, ro, 0, 6);
    }

    public static final NY create(byte[] bArr, RO ro, int i) {
        MY my = Companion;
        my.getClass();
        AbstractC2995aW.q(bArr, "<this>");
        return MY.d(my, bArr, ro, i, 4);
    }

    public static final NY create(byte[] bArr, RO ro, int i, int i2) {
        Companion.getClass();
        return MY.b(bArr, ro, i, i2);
    }
}
