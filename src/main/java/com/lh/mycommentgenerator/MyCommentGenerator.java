package com.lh.mycommentgenerator;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.api.ProgressCallback;
import org.mybatis.generator.api.dom.java.*;
import org.mybatis.generator.api.dom.xml.XmlElement;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.mybatis.generator.internal.util.StringUtility;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Set;

/**
 * @author Lihu
 * @PROJECT_NAME: distributedLearning
 * @DESCRIPTION:
 * @USER: Irene-Jisoo
 * @DATE: 2023/2/7 14:43
 */
public class MyCommentGenerator {


    private Properties properties = new Properties();
    private boolean suppressDate = false;
    private boolean suppressAllComments = false;
    private boolean addRemarkComments = false;
    private SimpleDateFormat dateFormat;

    public static void main(String[] args) {
        List<String> warnings = new ArrayList();
        boolean overwrite = true;
        File configFile = new File(MyCommentGenerator.class.getClassLoader().getResource("generatorConfig.xml").getFile());
        ConfigurationParser cp = new ConfigurationParser(warnings);

        try {
            Configuration config = cp.parseConfiguration(configFile);
            DefaultShellCallback callback = new DefaultShellCallback(overwrite);
            MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
            myBatisGenerator.generate((ProgressCallback)null);
        } catch (Exception var8) {
            var8.printStackTrace();
        }

    }

    public MyCommentGenerator() {
    }

    public void addConfigurationProperties(Properties properties) {
        this.properties.putAll(properties);
        this.suppressDate = StringUtility.isTrue(properties.getProperty("suppressDate"));
        this.suppressAllComments = StringUtility.isTrue(properties.getProperty("suppressAllComments"));
        this.addRemarkComments = StringUtility.isTrue(properties.getProperty("addRemarkComments"));
        String dateFormatString = properties.getProperty("dateFormat");
        if (StringUtility.stringHasValue(dateFormatString)) {
            this.dateFormat = new SimpleDateFormat(dateFormatString);
        }

    }

    public void addFieldComment(Field field, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {
        if (!this.suppressAllComments) {
            field.addJavaDocLine("/**");
            String remarks = introspectedColumn.getRemarks();
            if (this.addRemarkComments && StringUtility.stringHasValue(remarks)) {
                String[] remarkLines = remarks.split(System.getProperty("line.separator"));
                String[] var6 = remarkLines;
                int var7 = remarkLines.length;

                for(int var8 = 0; var8 < var7; ++var8) {
                    String remarkLine = var6[var8];
                    field.addJavaDocLine(" * " + remarkLine);
                }
            }

            field.addJavaDocLine(" */");
        }
    }

    public void addFieldComment(Field field, IntrospectedTable introspectedTable) {
        if (!this.suppressAllComments) {
            StringBuilder sb = new StringBuilder();
            field.addJavaDocLine("/**");
            sb.append(introspectedTable.getFullyQualifiedTable());
            field.addJavaDocLine(" */");
        }
    }

    public void addModelClassComment(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        if (!this.suppressAllComments && this.addRemarkComments) {
            topLevelClass.addJavaDocLine("/**");
            String remarks = introspectedTable.getRemarks();
            if (this.addRemarkComments && StringUtility.stringHasValue(remarks)) {
                String[] remarkLines = remarks.split(System.getProperty("line.separator"));
                String[] var5 = remarkLines;
                int var6 = remarkLines.length;

                for(int var7 = 0; var7 < var6; ++var7) {
                    String remarkLine = var5[var7];
                    topLevelClass.addJavaDocLine(" * " + remarkLine);
                }
            }

            topLevelClass.addJavaDocLine(" *");
            topLevelClass.addJavaDocLine(" * create by lihtech");
            topLevelClass.addJavaDocLine(" * " + introspectedTable.getFullyQualifiedTable().toString());
            topLevelClass.addJavaDocLine(" */");
            topLevelClass.addJavaDocLine("@Data");
        }
    }

    public void addClassComment(InnerClass innerClass, IntrospectedTable introspectedTable) {
    }

    public void addClassComment(InnerClass innerClass, IntrospectedTable introspectedTable, boolean b) {
    }

    public void addEnumComment(InnerEnum innerEnum, IntrospectedTable introspectedTable) {
    }

    public void addGetterComment(Method method, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {
    }

    public void addSetterComment(Method method, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {
    }

    public void addGeneralMethodComment(Method method, IntrospectedTable introspectedTable) {
    }

    public void addJavaFileComment(CompilationUnit compilationUnit) {
    }

    public void addComment(XmlElement xmlElement) {
    }

    public void addRootComment(XmlElement xmlElement) {
    }

    public void addGeneralMethodAnnotation(Method method, IntrospectedTable introspectedTable, Set<FullyQualifiedJavaType> set) {
    }

    public void addGeneralMethodAnnotation(Method method, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn, Set<FullyQualifiedJavaType> set) {
    }

    public void addFieldAnnotation(Field field, IntrospectedTable introspectedTable, Set<FullyQualifiedJavaType> set) {
    }

    public void addFieldAnnotation(Field field, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn, Set<FullyQualifiedJavaType> set) {
    }

    public void addClassAnnotation(InnerClass innerClass, IntrospectedTable introspectedTable, Set<FullyQualifiedJavaType> set) {
    }


}
