package snook;

import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.types.merc;

/* JADX INFO: compiled from: ImplicitClassReceiver.kt */
/* JADX INFO: loaded from: classes5.dex */
public class marial implements competently, taiyuan {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final p002kotlin.reflect.jvm.internal.impl.descriptors.wireman f37697attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final p002kotlin.reflect.jvm.internal.impl.descriptors.wireman f37698dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final marial f37699saneness;

    public marial(p002kotlin.reflect.jvm.internal.impl.descriptors.wireman classDescriptor, marial marialVar) {
        Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
        this.f37697attabal = classDescriptor;
        this.f37699saneness = marialVar == null ? this : marialVar;
        this.f37698dern = classDescriptor;
    }

    @Override // snook.taiyuan
    public final p002kotlin.reflect.jvm.internal.impl.descriptors.wireman arytenoidectomy() {
        return this.f37697attabal;
    }

    @Override // snook.competently
    /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
    public merc getType() {
        merc mercVarImpassible = this.f37697attabal.impassible();
        Intrinsics.checkNotNullExpressionValue(mercVarImpassible, "getDefaultType(...)");
        return mercVarImpassible;
    }

    public boolean equals(Object obj) {
        p002kotlin.reflect.jvm.internal.impl.descriptors.wireman wiremanVar = this.f37697attabal;
        marial marialVar = obj instanceof marial ? (marial) obj : null;
        return Intrinsics.wireman(wiremanVar, marialVar != null ? marialVar.f37697attabal : null);
    }

    public int hashCode() {
        return this.f37697attabal.hashCode();
    }

    public String toString() {
        return "Class{" + getType() + '}';
    }
}
