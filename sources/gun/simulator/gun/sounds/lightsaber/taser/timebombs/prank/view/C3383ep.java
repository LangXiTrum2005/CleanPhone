package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Logger;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ep, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3383ep {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4341a;
    public final long[] b;
    public final ArrayList c;
    public final ArrayList d;
    public boolean e;
    public boolean f;
    public C3877kY g;
    public int h;
    public long i;
    public final /* synthetic */ C3821jp j;

    public C3383ep(C3821jp c3821jp, String str) {
        AbstractC2995aW.q(c3821jp, "this$0");
        AbstractC2995aW.q(str, "key");
        this.j = c3821jp;
        this.f4341a = str;
        int i = c3821jp.d;
        this.b = new long[i];
        this.c = new ArrayList();
        this.d = new ArrayList();
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(i2);
            this.c.add(new File(this.j.b, sb.toString()));
            sb.append(".tmp");
            this.d.add(new File(this.j.b, sb.toString()));
            sb.setLength(length);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v5, types: [gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.z6] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object] */
    public final C3559gp a() {
        byte[] bArr = Vg0.f3884a;
        if (!this.e) {
            return null;
        }
        C3821jp c3821jp = this.j;
        if (!c3821jp.n && (this.g != null || this.f)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        long[] jArr = (long[]) this.b.clone();
        try {
            int i = c3821jp.d;
            int i2 = 0;
            while (i2 < i) {
                int i3 = i2 + 1;
                InterfaceC3035au interfaceC3035au = c3821jp.f4573a;
                File file = (File) this.c.get(i2);
                ((C2945Zt) interfaceC3035au).getClass();
                AbstractC2995aW.q(file, "file");
                Logger logger = AbstractC4926wS.f5180a;
                ?? c5164z6 = new C5164z6(new FileInputStream(file), Ic0.d);
                if (!c3821jp.n) {
                    this.h++;
                    c5164z6 = new C3294dp(c5164z6, c3821jp, this);
                }
                arrayList.add(c5164z6);
                i2 = i3;
            }
            return new C3559gp(this.j, this.f4341a, this.i, arrayList, jArr);
        } catch (FileNotFoundException unused) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Vg0.c((InterfaceC3588h80) it.next());
            }
            try {
                c3821jp.u(this);
            } catch (IOException unused2) {
            }
            return null;
        }
    }
}
