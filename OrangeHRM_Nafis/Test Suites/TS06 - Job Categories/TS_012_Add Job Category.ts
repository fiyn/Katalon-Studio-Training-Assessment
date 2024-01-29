<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>TS_012_Add Job Category</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>1</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>true</rerunImmediately>
   <testSuiteGuid>4973bf8a-db21-40ba-8134-ea807e8f015c</testSuiteGuid>
   <testCaseLink>
      <guid>5d3f7ce2-ef9e-415e-a0a7-3d7d6f0d8429</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/TC06 - Job Categories/01 - Add Job Category/01- Positive/TC_034_AddNewJobCategory</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>548d9c87-c517-4be3-9b6e-8945d9be3b09</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/TC06 - Job Categories/TD_003_AddNewJobCategory</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>548d9c87-c517-4be3-9b6e-8945d9be3b09</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>jobCategoryName</value>
         <variableId>6cb5c99f-ea65-43f0-8d8d-d02f59b7b9ca</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>e06e8d3a-66cb-4a38-af57-167186a05051</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/TC06 - Job Categories/01 - Add Job Category/02- Negative/TC_035_EnterExistingJobCategory</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>4a7080d6-9a79-4505-a2b1-366f38d01943</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/TC06 - Job Categories/TD_003_AddNewJobCategory</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>false</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>4a7080d6-9a79-4505-a2b1-366f38d01943</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>jobCategoryName</value>
         <variableId>6cb5c99f-ea65-43f0-8d8d-d02f59b7b9ca</variableId>
      </variableLink>
   </testCaseLink>
</TestSuiteEntity>
