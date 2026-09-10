package androidx.emoji2.text;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import technofreak.cutely;

/* JADX INFO: compiled from: DefaultEmojiCompatConfig.java */
/* JADX INFO: loaded from: classes.dex */
public final class attabal {

    /* JADX INFO: renamed from: androidx.emoji2.text.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DefaultEmojiCompatConfig.java */
    public static class C0069attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final saneness f9970attabal;

        public C0069attabal(saneness sanenessVar) {
            this.f9970attabal = sanenessVar == null ? marial() : sanenessVar;
        }

        public static saneness marial() {
            return Build.VERSION.SDK_INT >= 28 ? new wireman() : new dern();
        }

        public final androidx.emoji2.text.dern.AbstractC0071dern attabal(Context context, hardpan.marial marialVar) {
            if (marialVar == null) {
                return null;
            }
            return new marial(context, marialVar);
        }

        public final boolean beachfront(ProviderInfo providerInfo) {
            ApplicationInfo applicationInfo;
            return (providerInfo == null || (applicationInfo = providerInfo.applicationInfo) == null || (applicationInfo.flags & 1) != 1) ? false : true;
        }

        public final ProviderInfo competently(PackageManager packageManager) {
            Iterator<ResolveInfo> it = this.f9970attabal.dern(packageManager, new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
            while (it.hasNext()) {
                ProviderInfo providerInfoAttabal = this.f9970attabal.attabal(it.next());
                if (beachfront(providerInfoAttabal)) {
                    return providerInfoAttabal;
                }
            }
            return null;
        }

        public androidx.emoji2.text.dern.AbstractC0071dern dern(Context context) {
            return attabal(context, impromptu(context));
        }

        public hardpan.marial impromptu(Context context) {
            PackageManager packageManager = context.getPackageManager();
            cutely.impromptu(packageManager, "Package manager required to locate emoji font provider");
            ProviderInfo providerInfoCompetently = competently(packageManager);
            if (providerInfoCompetently == null) {
                return null;
            }
            try {
                return wireman(providerInfoCompetently, packageManager);
            } catch (PackageManager.NameNotFoundException e) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e);
                return null;
            }
        }

        public final List<List<byte[]>> saneness(Signature[] signatureArr) {
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            return Collections.singletonList(arrayList);
        }

        public final hardpan.marial wireman(ProviderInfo providerInfo, PackageManager packageManager) throws PackageManager.NameNotFoundException {
            String str = providerInfo.authority;
            String str2 = providerInfo.packageName;
            return new hardpan.marial(str, str2, "emojicompat-emoji-font", saneness(this.f9970attabal.saneness(packageManager, str2)));
        }
    }

    /* JADX INFO: compiled from: DefaultEmojiCompatConfig.java */
    public static class dern extends saneness {
        @Override // androidx.emoji2.text.attabal.saneness
        public ProviderInfo attabal(ResolveInfo resolveInfo) {
            return resolveInfo.providerInfo;
        }

        @Override // androidx.emoji2.text.attabal.saneness
        public List<ResolveInfo> dern(PackageManager packageManager, Intent intent, int i) {
            return packageManager.queryIntentContentProviders(intent, i);
        }
    }

    /* JADX INFO: compiled from: DefaultEmojiCompatConfig.java */
    public static class saneness {
        public ProviderInfo attabal(ResolveInfo resolveInfo) {
            throw null;
        }

        public List<ResolveInfo> dern(PackageManager packageManager, Intent intent, int i) {
            throw null;
        }

        public Signature[] saneness(PackageManager packageManager, String str) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(str, 64).signatures;
        }
    }

    /* JADX INFO: compiled from: DefaultEmojiCompatConfig.java */
    public static class wireman extends dern {
        @Override // androidx.emoji2.text.attabal.saneness
        public Signature[] saneness(PackageManager packageManager, String str) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(str, 64).signatures;
        }
    }

    public static marial attabal(Context context) {
        return (marial) new C0069attabal(null).dern(context);
    }
}
