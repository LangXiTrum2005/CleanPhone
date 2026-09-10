package p002kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;

/* JADX INFO: compiled from: LazyFieldLite.java */
/* JADX INFO: loaded from: classes5.dex */
public class cutely {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public wireman f31113attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public volatile boolean f31114dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public beachfront f31115saneness;
    protected volatile triweekly value;

    public void attabal(triweekly triweeklyVar) {
        if (this.value != null) {
            return;
        }
        synchronized (this) {
            if (this.value != null) {
                return;
            }
            try {
                if (this.f31113attabal != null) {
                    this.value = triweeklyVar.getParserForType().saneness(this.f31113attabal, this.f31115saneness);
                } else {
                    this.value = triweeklyVar;
                }
            } catch (IOException unused) {
            }
        }
    }

    public triweekly dern(triweekly triweeklyVar) {
        attabal(triweeklyVar);
        return this.value;
    }

    public int saneness() {
        return this.f31114dern ? this.value.getSerializedSize() : this.f31113attabal.size();
    }

    public triweekly wireman(triweekly triweeklyVar) {
        triweekly triweeklyVar2 = this.value;
        this.value = triweeklyVar;
        this.f31113attabal = null;
        this.f31114dern = true;
        return triweeklyVar2;
    }
}
