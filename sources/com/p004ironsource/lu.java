package com.p004ironsource;

import android.content.Context;
import android.support.v4.media.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0001\u0003B!\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u0003\u001a\u0004\u0018\u00010\u0002*\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0003\u001a\u0004\u0018\u00010\u0005*\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0003\u0010\u0006J\u0018\u0010\u0003\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016J\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000e\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0003\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0017¨\u0006\u001c"}, d2 = {"Lcom/ironsource/lu;", "Lcom/ironsource/i8;", "", "a", "(Ljava/lang/Long;)Ljava/lang/Long;", "", "(Ljava/lang/Integer;)Ljava/lang/Integer;", "", "identifier", "showCounter", "", "c", "(Ljava/lang/String;)Ljava/lang/Integer;", "lastShowTime", "b", "(Ljava/lang/String;)Ljava/lang/Long;", "threshold", "Landroid/content/Context;", "Landroid/content/Context;", "context", "Ljava/lang/String;", "baseName", "Lcom/ironsource/gi;", "Lcom/ironsource/gi;", "sdkSharedPref", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lcom/ironsource/gi;)V", "d", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class lu implements i8 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f25651e = -1;
    public static final long f = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String baseName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final gi sdkSharedPref;

    public lu(Context context, String baseName, gi sdkSharedPref) {
        Intrinsics.f(context, "context");
        Intrinsics.f(baseName, "baseName");
        Intrinsics.f(sdkSharedPref, "sdkSharedPref");
        this.context = context;
        this.baseName = baseName;
        this.sdkSharedPref = sdkSharedPref;
    }

    private final Integer a(Integer num) {
        if (num != null && num.intValue() == -1) {
            return null;
        }
        return num;
    }

    @Override // com.p004ironsource.i8
    public Long b(String identifier) {
        Intrinsics.f(identifier, "identifier");
        return a(Long.valueOf(this.sdkSharedPref.b(this.context, new mu(identifier, a.r(new StringBuilder(), this.baseName, ".pacing_last_show_time")).a(), -1L)));
    }

    @Override // com.p004ironsource.i8
    public Integer c(String identifier) {
        Intrinsics.f(identifier, "identifier");
        return a(Integer.valueOf(this.sdkSharedPref.b(this.context, new mu(identifier, a.r(new StringBuilder(), this.baseName, ".show_count_show_counter")).a(), -1)));
    }

    public /* synthetic */ lu(Context context, String str, gi giVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i2 & 4) != 0 ? new lt() : giVar);
    }

    private final Long a(Long l2) {
        if (l2 != null && l2.longValue() == -1) {
            return null;
        }
        return l2;
    }

    @Override // com.p004ironsource.i8
    public Long a(String identifier) {
        Intrinsics.f(identifier, "identifier");
        return a(Long.valueOf(this.sdkSharedPref.b(this.context, new mu(identifier, a.r(new StringBuilder(), this.baseName, ".show_count_threshold")).a(), -1L)));
    }

    @Override // com.p004ironsource.i8
    public void b(String identifier, long lastShowTime) {
        Intrinsics.f(identifier, "identifier");
        this.sdkSharedPref.a(this.context, new mu(identifier, a.r(new StringBuilder(), this.baseName, ".pacing_last_show_time")).a(), lastShowTime);
    }

    @Override // com.p004ironsource.i8
    public void a(String identifier, int showCounter) {
        Intrinsics.f(identifier, "identifier");
        this.sdkSharedPref.a(this.context, new mu(identifier, a.r(new StringBuilder(), this.baseName, ".show_count_show_counter")).a(), showCounter);
    }

    @Override // com.p004ironsource.i8
    public void a(String identifier, long threshold) {
        Intrinsics.f(identifier, "identifier");
        this.sdkSharedPref.a(this.context, new mu(identifier, a.r(new StringBuilder(), this.baseName, ".show_count_threshold")).a(), threshold);
    }
}
