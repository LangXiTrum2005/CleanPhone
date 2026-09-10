package org.objectweb.asm.commons;

import org.objectweb.asm.Label;

/* JADX INFO: loaded from: classes5.dex */
public interface TableSwitchGenerator {
    void generateCase(int i, Label label);

    void generateDefault();
}
