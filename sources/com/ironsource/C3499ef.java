package com.ironsource;

import android.content.Context;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.ef, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3499ef implements B3 {
    public static final a d = new a(null);
    public static final int e = -1;
    public static final long f = -1;
    private final Context a;
    private final String b;
    private final I8 c;

    /* JADX INFO: renamed from: com.ironsource.ef$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C3499ef(Context context, String baseName, I8 sdkSharedPref) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(baseName, "baseName");
        Intrinsics.checkNotNullParameter(sdkSharedPref, "sdkSharedPref");
        this.a = context;
        this.b = baseName;
        this.c = sdkSharedPref;
    }

    @Override // com.ironsource.B3
    public void a(String identifier, int i) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.c.a(this.a, new C3517ff(identifier, this.b + ".show_count_show_counter").a(), i);
    }

    @Override // com.ironsource.B3
    public Long b(String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        return a(Long.valueOf(this.c.b(this.a, new C3517ff(identifier, this.b + ".pacing_last_show_time").a(), -1L)));
    }

    @Override // com.ironsource.B3
    public Integer c(String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        return a(Integer.valueOf(this.c.b(this.a, new C3517ff(identifier, this.b + ".show_count_show_counter").a(), -1)));
    }

    @Override // com.ironsource.B3
    public void a(String identifier, long j) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.c.a(this.a, new C3517ff(identifier, this.b + ".pacing_last_show_time").a(), j);
    }

    @Override // com.ironsource.B3
    public void b(String identifier, long j) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.c.a(this.a, new C3517ff(identifier, this.b + ".show_count_threshold").a(), j);
    }

    public /* synthetic */ C3499ef(Context context, String str, I8 i8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i & 4) != 0 ? new C3864ze() : i8);
    }

    @Override // com.ironsource.B3
    public Long a(String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        return a(Long.valueOf(this.c.b(this.a, new C3517ff(identifier, this.b + ".show_count_threshold").a(), -1L)));
    }

    private final Long a(Long l) {
        if (l != null && l.longValue() == -1) {
            return null;
        }
        return l;
    }

    private final Integer a(Integer num) {
        if (num != null && num.intValue() == -1) {
            return null;
        }
        return num;
    }
}
