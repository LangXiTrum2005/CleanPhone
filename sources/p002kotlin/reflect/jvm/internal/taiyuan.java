package p002kotlin.reflect.jvm.internal;

import java.util.Comparator;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public class taiyuan implements Comparator {

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final Function2 f31932kowloon;

    public taiyuan(Function2 function2) {
        this.f31932kowloon = function2;
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return KDeclarationContainerImpl.adultoid(this.f31932kowloon, obj, obj2);
    }
}
