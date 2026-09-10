package com.google.protobuf;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
@CheckReturnValue
abstract class BufferAllocator {
    private static final BufferAllocator UNPOOLED = new BufferAllocator() { // from class: com.google.protobuf.BufferAllocator.1
        @Override // com.google.protobuf.BufferAllocator
        public AllocatedBuffer allocateDirectBuffer(int i2) {
            return AllocatedBuffer.wrap(ByteBuffer.allocateDirect(i2));
        }

        @Override // com.google.protobuf.BufferAllocator
        public AllocatedBuffer allocateHeapBuffer(int i2) {
            return AllocatedBuffer.wrap(new byte[i2]);
        }
    };

    public static BufferAllocator unpooled() {
        return UNPOOLED;
    }

    public abstract AllocatedBuffer allocateDirectBuffer(int i2);

    public abstract AllocatedBuffer allocateHeapBuffer(int i2);
}
