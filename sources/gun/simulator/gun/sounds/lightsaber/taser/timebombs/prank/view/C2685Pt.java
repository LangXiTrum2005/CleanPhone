package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.net.Uri;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Pt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2685Pt extends AbstractC3763j9 {
    public RandomAccessFile e;
    public Uri f;
    public long g;
    public boolean h;

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4429ql
    public final void close() {
        this.f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.e = null;
                if (this.h) {
                    this.h = false;
                    h();
                }
            } catch (IOException e) {
                throw new C2659Ot(e, 2000);
            }
        } catch (Throwable th) {
            this.e = null;
            if (this.h) {
                this.h = false;
                h();
            }
            throw th;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4429ql
    public final long d(C4868vl c4868vl) throws C2659Ot {
        Uri uri = c4868vl.f5150a;
        long j = c4868vl.f;
        this.f = uri;
        i();
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.e = randomAccessFile;
            try {
                randomAccessFile.seek(j);
                long length = c4868vl.g;
                if (length == -1) {
                    length = this.e.length() - j;
                }
                this.g = length;
                if (length < 0) {
                    throw new C2659Ot(null, null, 2008);
                }
                this.h = true;
                j(c4868vl);
                return this.g;
            } catch (IOException e) {
                throw new C2659Ot(e, 2000);
            }
        } catch (FileNotFoundException e2) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new C2659Ot(e2, (Ug0.f3833a < 21 || !AbstractC2633Nt.b(e2.getCause())) ? 2005 : 2006);
            }
            String path2 = uri.getPath();
            String query = uri.getQuery();
            String fragment = uri.getFragment();
            StringBuilder sbR = DM.r("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", path2, ",query=", query, ",fragment=");
            sbR.append(fragment);
            throw new C2659Ot(sbR.toString(), e2, 1004);
        } catch (SecurityException e3) {
            throw new C2659Ot(e3, 2006);
        } catch (RuntimeException e4) {
            throw new C2659Ot(e4, 2000);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4429ql
    public final Uri getUri() {
        return this.f;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3813jl
    public final int read(byte[] bArr, int i, int i2) throws C2659Ot {
        if (i2 == 0) {
            return 0;
        }
        long j = this.g;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.e;
            int i3 = Ug0.f3833a;
            int i4 = randomAccessFile.read(bArr, i, (int) Math.min(j, i2));
            if (i4 > 0) {
                this.g -= (long) i4;
                g(i4);
            }
            return i4;
        } catch (IOException e) {
            throw new C2659Ot(e, 2000);
        }
    }
}
