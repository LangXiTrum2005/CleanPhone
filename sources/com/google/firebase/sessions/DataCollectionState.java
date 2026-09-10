package com.google.firebase.sessions;

import com.google.firebase.encoders.json.NumberedEnum;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.google.firebase.sessions.DataCollectionState[], still in use, count: 1, list:
  (r0v1 com.google.firebase.sessions.DataCollectionState[]) from 0x003c: INVOKE (r0v1 com.google.firebase.sessions.DataCollectionState[]) STATIC call: kotlin.enums.EnumEntriesKt.a(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:(java.lang.Enum[]):kotlin.enums.EnumEntries (m), WRAPPED] (LINE:61)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(Unknown Source)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/firebase/sessions/DataCollectionState;", "Lcom/google/firebase/encoders/json/NumberedEnum;", "", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DataCollectionState implements NumberedEnum {
    /* JADX INFO: Fake field, exist only in values array */
    COLLECTION_UNKNOWN(0),
    COLLECTION_SDK_NOT_INSTALLED(1),
    COLLECTION_ENABLED(2),
    COLLECTION_DISABLED(3),
    /* JADX INFO: Fake field, exist only in values array */
    COLLECTION_DISABLED_REMOTE(4),
    /* JADX INFO: Fake field, exist only in values array */
    COLLECTION_SAMPLED(5);

    public static final /* synthetic */ EnumEntries g0;
    public final int X;

    static {
        g0 = EnumEntriesKt.a(dataCollectionStateArr);
    }

    public DataCollectionState(int i2) {
        super(str, i);
        this.X = i2;
    }

    public static DataCollectionState valueOf(String str) {
        return (DataCollectionState) Enum.valueOf(DataCollectionState.class, str);
    }

    public static DataCollectionState[] values() {
        return (DataCollectionState[]) f0.clone();
    }

    @Override // com.google.firebase.encoders.json.NumberedEnum
    /* JADX INFO: renamed from: getNumber, reason: from getter */
    public final int getX() {
        return this.X;
    }
}
