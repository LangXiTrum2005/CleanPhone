package com.google.android.datatransport;

/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_Event<T> extends Event<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f16671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Priority f16672b;

    public AutoValue_Event(Object obj, Priority priority) {
        if (obj == null) {
            throw new NullPointerException("Null payload");
        }
        this.f16671a = obj;
        this.f16672b = priority;
    }

    @Override // com.google.android.datatransport.Event
    public final Integer a() {
        return null;
    }

    @Override // com.google.android.datatransport.Event
    public final EventContext b() {
        return null;
    }

    @Override // com.google.android.datatransport.Event
    public final Object c() {
        return this.f16671a;
    }

    @Override // com.google.android.datatransport.Event
    public final Priority d() {
        return this.f16672b;
    }

    @Override // com.google.android.datatransport.Event
    public final ProductData e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Event)) {
            return false;
        }
        Event event = (Event) obj;
        if (event.a() == null) {
            return this.f16671a.equals(event.c()) && this.f16672b.equals(event.d()) && event.e() == null && event.b() == null;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f16672b.hashCode() ^ (((1000003 * 1000003) ^ this.f16671a.hashCode()) * 1000003)) * (-721379959);
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.f16671a + ", priority=" + this.f16672b + ", productData=null, eventContext=null}";
    }
}
