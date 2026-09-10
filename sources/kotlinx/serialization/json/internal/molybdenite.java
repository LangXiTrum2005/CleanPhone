package kotlinx.serialization.json.internal;

import com.applovin.sdk.AppLovinEventTypes;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Composers.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\nJ\u000f\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0011¨\u0006\u0013"}, d2 = {"Lkotlinx/serialization/json/internal/molybdenite;", "Lkotlinx/serialization/json/internal/triweekly;", "Lkotlinx/serialization/json/internal/gintrap;", "writer", "Lcutwater/attabal;", "json", "<init>", "(Lkotlinx/serialization/json/internal/gintrap;Lcutwater/attabal;)V", "", "saneness", "()V", "monoploid", "dern", "wireman", "arytenoidectomy", "Lcutwater/attabal;", "", "I", AppLovinEventTypes.USER_COMPLETED_LEVEL, "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class molybdenite extends triweekly {

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final cutwater.attabal json;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public int level;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public molybdenite(gintrap writer, cutwater.attabal json) {
        super(writer);
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(json, "json");
        this.json = json;
    }

    @Override // kotlinx.serialization.json.internal.triweekly
    public void arytenoidectomy() {
        beachfront(' ');
    }

    @Override // kotlinx.serialization.json.internal.triweekly
    public void dern() {
        kowloon(false);
        apical("\n");
        int i = this.level;
        for (int i2 = 0; i2 < i; i2++) {
            apical(this.json.getConfiguration().getPrettyPrintIndent());
        }
    }

    @Override // kotlinx.serialization.json.internal.triweekly
    public void monoploid() {
        this.level--;
    }

    @Override // kotlinx.serialization.json.internal.triweekly
    public void saneness() {
        kowloon(true);
        this.level++;
    }

    @Override // kotlinx.serialization.json.internal.triweekly
    public void wireman() {
        if (getWritingFirst()) {
            kowloon(false);
        } else {
            dern();
        }
    }
}
