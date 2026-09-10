package org.jacoco.core.analysis;

/* JADX INFO: loaded from: classes5.dex */
public interface ILine {
    ICounter getBranchCounter();

    ICounter getInstructionCounter();

    int getStatus();
}
