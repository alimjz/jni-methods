#include "com_example_macde_NativeAdder.h"

JNIEXPORT jint JNICALL Java_com_example_macde_NativeAdder_add
  (JNIEnv *env, jobject obj, jint a, jint b) {
    return a + b;
}