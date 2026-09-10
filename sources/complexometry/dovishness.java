package complexometry;

import p002kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001\u0003R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcomplexometry/dovishness;", "", "", "attabal", "Z", "dern", "()Z", "startMuted", "saneness", "customControlsRequested", "clickToExpandRequested", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class dovishness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final boolean startMuted;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final boolean clickToExpandRequested;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final boolean customControlsRequested;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\u0007J\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcomplexometry/dovishness$attabal;", "", "<init>", "()V", "", "startMuted", "wireman", "(Z)Lcomplexometry/dovishness$attabal;", "customControlsRequested", "dern", "clickToExpandRequested", "saneness", "Lcomplexometry/dovishness;", "attabal", "()Lcomplexometry/dovishness;", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
    public static final class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public boolean f23989attabal = true;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public boolean f23990dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public boolean f23991saneness;

        public final dovishness attabal() {
            return new dovishness(this.f23989attabal, this.f23991saneness, this.f23990dern, 0);
        }

        public final attabal dern(boolean customControlsRequested) {
            this.f23991saneness = customControlsRequested;
            return this;
        }

        public final attabal saneness(boolean clickToExpandRequested) {
            this.f23990dern = clickToExpandRequested;
            return this;
        }

        public final attabal wireman(boolean startMuted) {
            this.f23989attabal = startMuted;
            return this;
        }
    }

    public /* synthetic */ dovishness(boolean z, boolean z2, boolean z3, int i) {
        this(z, z2, z3);
    }

    /* JADX INFO: renamed from: attabal, reason: from getter */
    public final boolean getClickToExpandRequested() {
        return this.clickToExpandRequested;
    }

    /* JADX INFO: renamed from: dern, reason: from getter */
    public final boolean getStartMuted() {
        return this.startMuted;
    }

    /* JADX INFO: renamed from: saneness, reason: from getter */
    public final boolean getCustomControlsRequested() {
        return this.customControlsRequested;
    }

    public dovishness(boolean z, boolean z2, boolean z3) {
        this.startMuted = z;
        this.customControlsRequested = z2;
        this.clickToExpandRequested = z3;
    }
}
