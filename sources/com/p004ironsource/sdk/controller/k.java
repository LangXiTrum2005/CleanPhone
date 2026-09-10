package com.p004ironsource.sdk.controller;

import android.content.Context;
import android.content.Intent;
import com.p004ironsource.InterfaceC3356g;
import com.p004ironsource.InterfaceC3358h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lcom/ironsource/sdk/controller/k;", "", "a", "b", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public interface k {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lcom/ironsource/sdk/controller/k$a;", "Lcom/ironsource/g;", "Landroid/content/Intent;", "a", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements InterfaceC3356g {
        @Override // com.p004ironsource.InterfaceC3356g
        public Intent a() {
            return new Intent("android.intent.action.VIEW");
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/ironsource/sdk/controller/k$b;", "Lcom/ironsource/h;", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "a", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class b implements InterfaceC3358h {
        @Override // com.p004ironsource.InterfaceC3358h
        public Intent a(Context context) {
            Intrinsics.f(context, "context");
            return new Intent(context, (Class<?>) OpenUrlActivity.class);
        }
    }
}
