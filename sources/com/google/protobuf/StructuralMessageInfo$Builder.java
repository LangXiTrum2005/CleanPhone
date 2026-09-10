package com.google.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class StructuralMessageInfo$Builder {
    private int[] checkInitialized;
    private Object defaultInstance;
    private final List<s1> fields;
    private boolean messageSetWireFormat;
    private ProtoSyntax syntax;
    private boolean wasBuilt;

    public StructuralMessageInfo$Builder() {
        this.checkInitialized = null;
        this.fields = new ArrayList();
    }

    public j4 build() {
        if (this.wasBuilt) {
            throw new IllegalStateException("Builder can only build once");
        }
        if (this.syntax == null) {
            throw new IllegalStateException("Must specify a proto syntax");
        }
        this.wasBuilt = true;
        Collections.sort(this.fields);
        return new j4(this.syntax, this.messageSetWireFormat, this.checkInitialized, (s1[]) this.fields.toArray(new s1[0]), this.defaultInstance);
    }

    public void withCheckInitialized(int[] iArr) {
        this.checkInitialized = iArr;
    }

    public void withDefaultInstance(Object obj) {
        this.defaultInstance = obj;
    }

    public void withField(s1 s1Var) {
        if (this.wasBuilt) {
            throw new IllegalStateException("Builder can only build once");
        }
        this.fields.add(s1Var);
    }

    public void withMessageSetWireFormat(boolean z10) {
        this.messageSetWireFormat = z10;
    }

    public void withSyntax(ProtoSyntax protoSyntax) {
        this.syntax = (ProtoSyntax) Internal.checkNotNull(protoSyntax, "syntax");
    }

    public StructuralMessageInfo$Builder(int i10) {
        this.checkInitialized = null;
        this.fields = new ArrayList(i10);
    }
}
