package ru.yandex.qatools.allure.junit.inject.testdata;

import org.junit.Test;

/**
 * @author Dmitry Baev charlie@yandex-team.ru
 *         Date: 20.09.13
 */
public interface InterfaceWithTestMethod {
    @Test
    int test();
}
