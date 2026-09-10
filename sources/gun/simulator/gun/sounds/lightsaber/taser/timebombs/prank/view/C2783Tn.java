package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R;
import java.io.InputStream;
import java.util.Locale;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Tn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2783Tn implements InterfaceC4150nd0, ModelLoaderFactory, InterfaceC4669tZ {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources f3793a;

    public C2783Tn(Resources resources, int i) {
        if (i != 1) {
            this.f3793a = resources;
        } else {
            this.f3793a = resources;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0044  */
    public String a(C4619sw c4619sw) {
        String displayName;
        String[] strArr = new String[2];
        String str = c4619sw.c;
        if (TextUtils.isEmpty(str) || com.mbridge.msdk.playercommon.exoplayer2.C.LANGUAGE_UNDETERMINED.equals(str)) {
            displayName = "";
        } else {
            int i = Ug0.f3833a;
            Locale localeForLanguageTag = i >= 21 ? Locale.forLanguageTag(str) : new Locale(str);
            Locale locale = i >= 24 ? Locale.getDefault(Locale.Category.DISPLAY) : Locale.getDefault();
            displayName = localeForLanguageTag.getDisplayName(locale);
            if (TextUtils.isEmpty(displayName)) {
                displayName = "";
            } else {
                try {
                    int iOffsetByCodePoints = displayName.offsetByCodePoints(0, 1);
                    displayName = displayName.substring(0, iOffsetByCodePoints).toUpperCase(locale) + displayName.substring(iOffsetByCodePoints);
                } catch (IndexOutOfBoundsException unused) {
                }
            }
        }
        strArr[0] = displayName;
        strArr[1] = b(c4619sw);
        String strC = c(strArr);
        if (!TextUtils.isEmpty(strC)) {
            return strC;
        }
        String str2 = c4619sw.b;
        return TextUtils.isEmpty(str2) ? "" : str2;
    }

    public String b(C4619sw c4619sw) {
        int i = c4619sw.e;
        int i2 = i & 2;
        Resources resources = this.f3793a;
        String string = i2 != 0 ? resources.getString(R.string.exo_track_role_alternate) : "";
        if ((i & 4) != 0) {
            string = c(string, resources.getString(R.string.exo_track_role_supplementary));
        }
        if ((i & 8) != 0) {
            string = c(string, resources.getString(R.string.exo_track_role_commentary));
        }
        return (i & 1088) != 0 ? c(string, resources.getString(R.string.exo_track_role_closed_captions)) : string;
    }

    public String c(String... strArr) {
        String string = "";
        for (String str : strArr) {
            if (str.length() > 0) {
                string = TextUtils.isEmpty(string) ? str : this.f3793a.getString(R.string.exo_item_list, string, str);
            }
        }
        return string;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4669tZ
    public InterfaceC3616hZ o(InterfaceC3616hZ interfaceC3616hZ, YS ys) {
        if (interfaceC3616hZ == null) {
            return null;
        }
        return new C2485Ia(this.f3793a, interfaceC3616hZ);
    }

    @Override // com.bumptech.glide.load.model.ModelLoaderFactory
    public FP z(C3166cQ c3166cQ) {
        return new C2862Wo(this.f3793a, c3166cQ.c(Uri.class, InputStream.class));
    }

    public C2783Tn(Resources resources) {
        resources.getClass();
        this.f3793a = resources;
    }
}
