package igo;

import java.lang.reflect.Field;
import p002kotlin.Metadata;
import p002kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DebugMetadata.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u00020\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0000H\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "Ljava/lang/StackTraceElement;", "dern", "(Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;)Ljava/lang/StackTraceElement;", "Ligo/wireman;", "attabal", "(Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;)Ligo/wireman;", "", "saneness", "(Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;)I", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class marial {
    public static final wireman attabal(BaseContinuationImpl baseContinuationImpl) {
        return (wireman) baseContinuationImpl.getClass().getAnnotation(wireman.class);
    }

    public static final StackTraceElement dern(BaseContinuationImpl baseContinuationImpl) {
        String strC;
        Intrinsics.checkNotNullParameter(baseContinuationImpl, "<this>");
        wireman wiremanVarAttabal = attabal(baseContinuationImpl);
        if (wiremanVarAttabal == null || wiremanVarAttabal.v() < 1) {
            return null;
        }
        int iSaneness = saneness(baseContinuationImpl);
        int i = iSaneness < 0 ? -1 : wiremanVarAttabal.l()[iSaneness];
        String strSaneness = competently.f28404attabal.saneness(baseContinuationImpl);
        if (strSaneness == null) {
            strC = wiremanVarAttabal.c();
        } else {
            strC = strSaneness + '/' + wiremanVarAttabal.c();
        }
        return new StackTraceElement(strC, wiremanVarAttabal.m(), wiremanVarAttabal.f(), i);
    }

    public static final int saneness(BaseContinuationImpl baseContinuationImpl) {
        try {
            Field declaredField = baseContinuationImpl.getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(baseContinuationImpl);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            return (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            return -1;
        }
    }
}
