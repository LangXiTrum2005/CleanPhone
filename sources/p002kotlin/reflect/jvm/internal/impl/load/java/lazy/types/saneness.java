package p002kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import p002kotlin.collections.privatdozent;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.clubfoot;
import p002kotlin.reflect.jvm.internal.impl.types.TypeUsage;

/* JADX INFO: compiled from: JavaTypeAttributes.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class saneness {
    public static final attabal attabal(TypeUsage typeUsage, boolean z, boolean z2, clubfoot clubfootVar) {
        Intrinsics.checkNotNullParameter(typeUsage, "<this>");
        return new attabal(typeUsage, null, z2, z, clubfootVar != null ? privatdozent.wireman(clubfootVar) : null, null, 34, null);
    }

    public static /* synthetic */ attabal saneness(TypeUsage typeUsage, boolean z, boolean z2, clubfoot clubfootVar, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        if ((i & 4) != 0) {
            clubfootVar = null;
        }
        return attabal(typeUsage, z, z2, clubfootVar);
    }
}
