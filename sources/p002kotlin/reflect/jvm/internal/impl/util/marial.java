package p002kotlin.reflect.jvm.internal.impl.util;

import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AttributeArrayOwner.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class marial<K, T> extends attabal<K, T> {

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public dern<T> f31909kowloon;

    public marial(dern<T> arrayMap) {
        Intrinsics.checkNotNullParameter(arrayMap, "arrayMap");
        this.f31909kowloon = arrayMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p002kotlin.reflect.jvm.internal.impl.util.attabal
    public final void marial(String keyQualifiedName, T value) {
        Intrinsics.checkNotNullParameter(keyQualifiedName, "keyQualifiedName");
        Intrinsics.checkNotNullParameter(value, "value");
        int iWireman = wireman().wireman(keyQualifiedName);
        int iSaneness = this.f31909kowloon.saneness();
        if (iSaneness == 0) {
            this.f31909kowloon = new triweekly(value, iWireman);
            return;
        }
        if (iSaneness == 1) {
            dern<T> dernVar = this.f31909kowloon;
            Intrinsics.competently(dernVar, "null cannot be cast to non-null type org.jetbrains.kotlin.util.OneElementArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>");
            triweekly triweeklyVar = (triweekly) dernVar;
            if (triweeklyVar.marial() == iWireman) {
                this.f31909kowloon = new triweekly(value, iWireman);
                return;
            } else {
                wireman wiremanVar = new wireman();
                this.f31909kowloon = wiremanVar;
                wiremanVar.wireman(triweeklyVar.marial(), triweeklyVar.beachfront());
            }
        }
        this.f31909kowloon.wireman(iWireman, value);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.util.attabal
    public final dern<T> saneness() {
        return this.f31909kowloon;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public marial() {
        impromptu impromptuVar = impromptu.f31857kowloon;
        Intrinsics.competently(impromptuVar, "null cannot be cast to non-null type org.jetbrains.kotlin.util.ArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>");
        this(impromptuVar);
    }
}
