package androidx.core.view;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Objects;

/* JADX INFO: compiled from: ContentInfoCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class wireman {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final beachfront f9454attabal;

    /* JADX INFO: compiled from: ContentInfoCompat.java */
    public static final class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final dern f9455attabal;

        public attabal(ClipData clipData, int i) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.f9455attabal = new saneness(clipData, i);
            } else {
                this.f9455attabal = new C0064wireman(clipData, i);
            }
        }

        public wireman attabal() {
            return this.f9455attabal.build();
        }

        public attabal dern(int i) {
            this.f9455attabal.saneness(i);
            return this;
        }

        public attabal saneness(Bundle bundle) {
            this.f9455attabal.setExtras(bundle);
            return this;
        }

        public attabal wireman(Uri uri) {
            this.f9455attabal.attabal(uri);
            return this;
        }
    }

    /* JADX INFO: compiled from: ContentInfoCompat.java */
    public interface beachfront {
        ClipData arytenoidectomy();

        int competently();

        ContentInfo impromptu();

        int taiyuan();
    }

    /* JADX INFO: compiled from: ContentInfoCompat.java */
    public static final class competently implements beachfront {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final ClipData f9456attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final int f9457dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public final Bundle f9458marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final int f9459saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final Uri f9460wireman;

        public competently(C0064wireman c0064wireman) {
            this.f9456attabal = (ClipData) technofreak.cutely.competently(c0064wireman.f9463attabal);
            this.f9459saneness = technofreak.cutely.dern(c0064wireman.f9466saneness, 0, 5, "source");
            this.f9457dern = technofreak.cutely.beachfront(c0064wireman.f9464dern, 1);
            this.f9460wireman = c0064wireman.f9467wireman;
            this.f9458marial = c0064wireman.f9465marial;
        }

        @Override // androidx.core.view.wireman.beachfront
        public ClipData arytenoidectomy() {
            return this.f9456attabal;
        }

        @Override // androidx.core.view.wireman.beachfront
        public int competently() {
            return this.f9459saneness;
        }

        @Override // androidx.core.view.wireman.beachfront
        public ContentInfo impromptu() {
            return null;
        }

        @Override // androidx.core.view.wireman.beachfront
        public int taiyuan() {
            return this.f9457dern;
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("ContentInfoCompat{clip=");
            sb.append(this.f9456attabal.getDescription());
            sb.append(", source=");
            sb.append(wireman.marial(this.f9459saneness));
            sb.append(", flags=");
            sb.append(wireman.attabal(this.f9457dern));
            if (this.f9460wireman == null) {
                str = "";
            } else {
                str = ", hasLinkUri(" + this.f9460wireman.toString().length() + ")";
            }
            sb.append(str);
            sb.append(this.f9458marial != null ? ", hasExtras" : "");
            sb.append("}");
            return sb.toString();
        }
    }

    /* JADX INFO: compiled from: ContentInfoCompat.java */
    public interface dern {
        void attabal(Uri uri);

        wireman build();

        void saneness(int i);

        void setExtras(Bundle bundle);
    }

    /* JADX INFO: compiled from: ContentInfoCompat.java */
    public static final class marial implements beachfront {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final ContentInfo f9461attabal;

        public marial(ContentInfo contentInfo) {
            this.f9461attabal = androidx.core.view.dern.attabal(technofreak.cutely.competently(contentInfo));
        }

        @Override // androidx.core.view.wireman.beachfront
        public ClipData arytenoidectomy() {
            return this.f9461attabal.getClip();
        }

        @Override // androidx.core.view.wireman.beachfront
        public int competently() {
            return this.f9461attabal.getSource();
        }

        @Override // androidx.core.view.wireman.beachfront
        public ContentInfo impromptu() {
            return this.f9461attabal;
        }

        @Override // androidx.core.view.wireman.beachfront
        public int taiyuan() {
            return this.f9461attabal.getFlags();
        }

        public String toString() {
            return "ContentInfoCompat{" + this.f9461attabal + "}";
        }
    }

    /* JADX INFO: compiled from: ContentInfoCompat.java */
    public static final class saneness implements dern {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final ContentInfo.Builder f9462attabal;

        public saneness(ClipData clipData, int i) {
            this.f9462attabal = androidx.core.view.competently.attabal(clipData, i);
        }

        @Override // androidx.core.view.wireman.dern
        public void attabal(Uri uri) {
            this.f9462attabal.setLinkUri(uri);
        }

        @Override // androidx.core.view.wireman.dern
        public wireman build() {
            return new wireman(new marial(this.f9462attabal.build()));
        }

        @Override // androidx.core.view.wireman.dern
        public void saneness(int i) {
            this.f9462attabal.setFlags(i);
        }

        @Override // androidx.core.view.wireman.dern
        public void setExtras(Bundle bundle) {
            this.f9462attabal.setExtras(bundle);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.wireman$wireman, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ContentInfoCompat.java */
    public static final class C0064wireman implements dern {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public ClipData f9463attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public int f9464dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public Bundle f9465marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public int f9466saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public Uri f9467wireman;

        public C0064wireman(ClipData clipData, int i) {
            this.f9463attabal = clipData;
            this.f9466saneness = i;
        }

        @Override // androidx.core.view.wireman.dern
        public void attabal(Uri uri) {
            this.f9467wireman = uri;
        }

        @Override // androidx.core.view.wireman.dern
        public wireman build() {
            return new wireman(new competently(this));
        }

        @Override // androidx.core.view.wireman.dern
        public void saneness(int i) {
            this.f9464dern = i;
        }

        @Override // androidx.core.view.wireman.dern
        public void setExtras(Bundle bundle) {
            this.f9465marial = bundle;
        }
    }

    public wireman(beachfront beachfrontVar) {
        this.f9454attabal = beachfrontVar;
    }

    public static String attabal(int i) {
        return (i & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i);
    }

    public static wireman competently(ContentInfo contentInfo) {
        return new wireman(new marial(contentInfo));
    }

    public static String marial(int i) {
        if (i == 0) {
            return "SOURCE_APP";
        }
        if (i == 1) {
            return "SOURCE_CLIPBOARD";
        }
        if (i == 2) {
            return "SOURCE_INPUT_METHOD";
        }
        if (i == 3) {
            return "SOURCE_DRAG_AND_DROP";
        }
        if (i != 4) {
            return i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT";
        }
        return "SOURCE_AUTOFILL";
    }

    public ContentInfo beachfront() {
        ContentInfo contentInfoImpromptu = this.f9454attabal.impromptu();
        Objects.requireNonNull(contentInfoImpromptu);
        return androidx.core.view.dern.attabal(contentInfoImpromptu);
    }

    public int dern() {
        return this.f9454attabal.taiyuan();
    }

    public ClipData saneness() {
        return this.f9454attabal.arytenoidectomy();
    }

    public String toString() {
        return this.f9454attabal.toString();
    }

    public int wireman() {
        return this.f9454attabal.competently();
    }
}
