package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.SplashActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding.ActivitySplashBinding;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes4.dex */
public final class VQ implements DB {
    public static volatile VQ b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DB f3870a = C3044b1.b.f4152a.c();

    public static VQ a() {
        if (b == null) {
            synchronized (VQ.class) {
                try {
                    if (b == null) {
                        b = new VQ();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.FB
    public final void b(ConstraintLayout constraintLayout) {
        DB db = this.f3870a;
        if (db != null) {
            db.b(constraintLayout);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.FB
    public final void c(ConstraintLayout constraintLayout) {
        DB db = this.f3870a;
        if (db != null) {
            db.c(constraintLayout);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DB
    public final void f(SplashActivity splashActivity, ConstraintLayout constraintLayout, C3491g4 c3491g4, IS is) {
        DB db = this.f3870a;
        if (db != null) {
            db.f(splashActivity, constraintLayout, c3491g4, is);
            return;
        }
        if (is != null) {
            byte[] bArr = {74, 23, -8, -105, -56, 116, 89, 85, 67, 20, -8, -115, -64, 101, 89, 102, 7, 48, -22, -61, -49, 119, 80, 120};
            byte[] bArr2 = {39, 89, -103, -29, -95, 2, 60, 20};
            int i = 0;
            int i2 = 0;
            while (i < 24) {
                if (i2 >= 8) {
                    i2 = 0;
                }
                bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
                i++;
                i2++;
            }
            new String(bArr, StandardCharsets.UTF_8);
            QL ql = (QL) is;
            switch (ql.f3599a) {
                case 1:
                    ((ActivitySplashBinding) ((SplashActivity) ql.b).getMBinding()).ivAdPlacementSplash.setVisibility(0);
                    break;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DB
    public final void g(Context context, ConstraintLayout constraintLayout, C3491g4 c3491g4, String str, C2498In c2498In, int i, IS is) {
        DB db = this.f3870a;
        if (db != null) {
            db.g(context, constraintLayout, c3491g4, str, c2498In, 1, is);
            return;
        }
        byte[] bArr = {-33, -27, -119, 80, -110, 39, 120, -23, -42, -26, -119, 74, -102, 54, 120, -38, -110, -62, -101, 4, -107, 36, 113, -60};
        byte[] bArr2 = {-78, -85, -24, 36, -5, 81, 29, -88};
        int i2 = 0;
        int i3 = 0;
        while (i2 < 24) {
            if (i3 >= 8) {
                i3 = 0;
            }
            bArr[i2] = (byte) (bArr[i2] ^ bArr2[i3]);
            i2++;
            i3++;
        }
        new String(bArr, StandardCharsets.UTF_8);
        QL ql = (QL) is;
        switch (ql.f3599a) {
            case 1:
                ((ActivitySplashBinding) ((SplashActivity) ql.b).getMBinding()).ivAdPlacementSplash.setVisibility(0);
                break;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.FB
    public final void j(ViewGroup viewGroup) {
        DB db = this.f3870a;
        if (db != null) {
            db.j(viewGroup);
        }
    }
}
