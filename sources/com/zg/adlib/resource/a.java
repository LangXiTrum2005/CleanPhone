package com.zg.adlib.resource;

import androidx.room.d;
import io.reactivex.functions.Function;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a implements Function {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ Function1 f42873Y;

    public /* synthetic */ a(int i2, Function1 function1) {
        this.X = i2;
        this.f42873Y = function1;
    }

    @Override // io.reactivex.functions.Function
    public final Object apply(Object obj) {
        switch (this.X) {
            case 0:
                return ResourceExtKt.mapOriginalResource$lambda$0(this.f42873Y, obj);
            case 1:
                return ResourceExtKt.mapResponseToResource$lambda$3(this.f42873Y, obj);
            default:
                return ResourceExtKt.mapResource$lambda$2((d) this.f42873Y, obj);
        }
    }
}
