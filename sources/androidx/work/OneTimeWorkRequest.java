package androidx.work;

import androidx.work.impl.model.WorkSpec;
import java.util.HashSet;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class OneTimeWorkRequest extends WorkRequest {

    public static final class Builder extends WorkRequest.Builder<Builder, OneTimeWorkRequest> {
        public Builder(Class cls) {
            this.f8649c = new HashSet();
            this.f8647a = UUID.randomUUID();
            this.f8648b = new WorkSpec(this.f8647a.toString(), cls.getName());
            this.f8649c.add(cls.getName());
            this.f8648b.d = OverwritingInputMerger.class.getName();
        }

        @Override // androidx.work.WorkRequest.Builder
        public final WorkRequest b() {
            return new OneTimeWorkRequest(this.f8647a, this.f8648b, this.f8649c);
        }
    }
}
