package androidx.media3.extractor.jpeg;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class MotionPhotoDescription {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f6904b;

    public static final class ContainerItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f6905a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f6906b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f6907c;

        public ContainerItem(String str, long j, long j2) {
            this.f6905a = str;
            this.f6906b = j;
            this.f6907c = j2;
        }
    }

    public MotionPhotoDescription(long j, List list) {
        this.f6903a = j;
        this.f6904b = list;
    }
}
