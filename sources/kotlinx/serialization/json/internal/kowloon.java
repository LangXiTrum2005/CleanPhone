package kotlinx.serialization.json.internal;

import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Composers.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lkotlinx/serialization/json/internal/kowloon;", "Lkotlinx/serialization/json/internal/triweekly;", "Lkotlinx/serialization/json/internal/gintrap;", "writer", "", "forceQuoting", "<init>", "(Lkotlinx/serialization/json/internal/gintrap;Z)V", "", "value", "", "triweekly", "(Ljava/lang/String;)V", "dern", "Z", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class kowloon extends triweekly {

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final boolean forceQuoting;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kowloon(gintrap writer, boolean z) {
        super(writer);
        Intrinsics.checkNotNullParameter(writer, "writer");
        this.forceQuoting = z;
    }

    @Override // kotlinx.serialization.json.internal.triweekly
    public void triweekly(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (this.forceQuoting) {
            super.triweekly(value);
        } else {
            super.apical(value);
        }
    }
}
