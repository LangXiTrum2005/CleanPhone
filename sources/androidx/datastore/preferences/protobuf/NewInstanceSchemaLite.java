package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
@CheckReturnValue
final class NewInstanceSchemaLite implements NewInstanceSchema {
    @Override // androidx.datastore.preferences.protobuf.NewInstanceSchema
    public final GeneratedMessageLite newInstance(Object obj) {
        return ((GeneratedMessageLite) obj).p();
    }
}
