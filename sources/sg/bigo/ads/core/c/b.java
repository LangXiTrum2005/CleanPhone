package sg.bigo.ads.core.c;

import com.iab.omid.library.bigosg.adsession.AdEvents;
import com.iab.omid.library.bigosg.adsession.AdSession;
import com.iab.omid.library.bigosg.adsession.media.InteractionType;
import com.iab.omid.library.bigosg.adsession.media.MediaEvents;
import com.iab.omid.library.bigosg.adsession.media.Position;
import com.iab.omid.library.bigosg.adsession.media.VastProperties;
import com.p004ironsource.d9;
import sg.bigo.ads.common.n.d;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MediaEvents f48326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f48327b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AdSession f48328c;
    private final AdEvents d;

    /* JADX INFO: renamed from: sg.bigo.ads.core.c.b$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f48330a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f48331b;

        static {
            int[] iArr = new int[a.a().length];
            f48331b = iArr;
            try {
                iArr[a.f48332a - 1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f48331b[a.f48333b - 1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f48331b[a.f48334c - 1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f48331b[a.d - 1] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f48331b[a.f48335e - 1] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[EnumC0866b.a().length];
            f48330a = iArr2;
            try {
                iArr2[EnumC0866b.f48336a - 1] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f48330a[EnumC0866b.f48337b - 1] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f48330a[EnumC0866b.f48338c - 1] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f48330a[EnumC0866b.d - 1] = 4;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f48332a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f48333b = 2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f48334c = 3;
        public static final int d = 4;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f48335e = 5;
        private static final /* synthetic */ int[] f = {1, 2, 3, 4, 5};

        public static int[] a() {
            return (int[]) f.clone();
        }
    }

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX INFO: renamed from: sg.bigo.ads.core.c.b$b, reason: collision with other inner class name */
    public static final class EnumC0866b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f48336a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f48337b = 2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f48338c = 3;
        public static final int d = 4;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ int[] f48339e = {1, 2, 3, 4};

        public static int[] a() {
            return (int[]) f48339e.clone();
        }
    }

    public b(AdSession adSession, MediaEvents mediaEvents) {
        this.f48328c = adSession;
        this.f48326a = mediaEvents;
        AdEvents adEventsCreateAdEvents = AdEvents.createAdEvents(adSession);
        this.d = adEventsCreateAdEvents;
        try {
            if (this.f48326a != null) {
                adEventsCreateAdEvents.loaded(VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE));
            } else {
                adEventsCreateAdEvents.loaded();
            }
            a(d9.h.r);
        } catch (Exception unused) {
        }
    }

    public final void a() {
        try {
            this.d.impressionOccurred();
            a("impression");
        } catch (Exception unused) {
        }
    }

    public final void b() {
        if (d.b()) {
            c();
        } else {
            d.a(2, new Runnable() { // from class: sg.bigo.ads.core.c.b.1
                @Override // java.lang.Runnable
                public final void run() {
                    b.this.c();
                }
            });
        }
        this.f48326a = null;
    }

    public final void c() {
        try {
            this.f48328c.finish();
        } catch (Throwable unused) {
        }
    }

    public final void a(float f, float f2) {
        MediaEvents mediaEvents = this.f48326a;
        if (mediaEvents == null) {
            return;
        }
        mediaEvents.start(f, f2);
        this.f48327b = true;
        a("video start, duration: " + f + ", volume: " + f2);
    }

    public final void b(int i2) {
        String str;
        MediaEvents mediaEvents = this.f48326a;
        if (mediaEvents == null) {
            return;
        }
        int i3 = AnonymousClass2.f48331b[i2 - 1];
        if (i3 == 1) {
            mediaEvents.pause();
            str = "video pause";
        } else if (i3 == 2) {
            mediaEvents.resume();
            str = "video resume";
        } else if (i3 == 3) {
            mediaEvents.bufferStart();
            str = "video buffer start";
        } else if (i3 == 4) {
            mediaEvents.bufferFinish();
            str = "video buffer finish";
        } else {
            if (i3 != 5) {
                return;
            }
            mediaEvents.skipped();
            str = "video skipped";
        }
        a(str);
    }

    public final void a(int i2) {
        String str;
        MediaEvents mediaEvents = this.f48326a;
        if (mediaEvents == null) {
            return;
        }
        int i3 = AnonymousClass2.f48330a[i2 - 1];
        if (i3 == 1) {
            mediaEvents.firstQuartile();
            str = "video first quartile";
        } else if (i3 == 2) {
            mediaEvents.midpoint();
            str = "video mid point";
        } else if (i3 == 3) {
            mediaEvents.thirdQuartile();
            str = "video third quartile";
        } else {
            if (i3 != 4) {
                return;
            }
            mediaEvents.complete();
            str = "video complete";
        }
        a(str);
    }

    public final void a(InteractionType interactionType) {
        MediaEvents mediaEvents = this.f48326a;
        if (mediaEvents == null) {
            return;
        }
        mediaEvents.adUserInteraction(interactionType);
        a("ad user interaction: " + interactionType.toString());
    }

    public final void a(String str) {
        StringBuilder sbY = android.support.v4.media.a.y("Event: ", str, " (");
        sbY.append(this.f48328c.getAdSessionId());
        sbY.append(")");
        sg.bigo.ads.common.t.a.a(0, 3, "OMSDK", sbY.toString());
    }
}
