# Project 0

**Step 1 of P0** Due: 09/02/22 11:59pm EDT <br>
**Steps 2-5 of P0** Due: 09/07/22, 11:59pm EDT

## 1.  Join The Organization - Due 09/02/22

Fill out [this form](https://forms.gle/V5htMMDLxetCSWbd8) with your name and GitHub username. <br>
**Note: the above form is due on 09/02/22 11:59 pm EDT in order to provide you sufficent time to complete the rest of the project. Every step below is due 09/07/22 11:59 pm EDT**

## 2.  Join The Slack

We will be using Slack for all forms of communication in this class.
Join the slack with [this link](https://join.slack.com/t/cmsc389tfall2022/shared_invite/zt-1f58hxsxx-fUgUaRnxZcZIZNGSRC_SQA).

## 3.  Team Formation

Sign up for a team on ELMS under the People's Tab. For more details, see the ELMS Assignment.
Your assigned project manager will add you to your team's slack channel and invite you to collaborate on your team's repo. _Teams can be no more that 4 people._

## 4.  Set Up Your Local Git Environment


Take the following steps to set up your Local Git Environment

1. Generate your ssh-keys with `ssh-keygen`
1. Configure your local environment with your name and email
   - `git config --global user.name "your_name_here"`
   - `git config --global user.email your_email_here`
1. Add your ssh-keys to your GitHub account
1. Clone our setup repository using ssh `git clone git@github.com:cmsc389T-fall22/git-java-setup.git`

**You CANNOT do the below steps until you have submitted the survey, added to the organization and _accepted_ the invitation that would be sent to the email you used to sign up for Github**

Once you have cloned the remote repository, checkout the setup branch

```bash
cd {path_to_repo}
git checkout setup
git pull
```

Edit the main README and add your name as one of the lines. Then add, commit, and push your changes:

```bash
git add README.md
git commit -m "{your_name} git setup"
git push -u origin setup
```

If you have a merge conflict, you can delete the annotations that have been created by git (starts with `<<<`
or ends with `>>>`) and push your changes:

```bash
git add README.md
git commit -m "{your_name} fix merge conflict"
git push -u origin setup"
```

## 5.  Checking Your Java Installation

To check your java installation, compile and run the HelloWorld class in the repository:

```bash
javac HelloWorld.java
java HelloWorld
```
**Below are the instructions for JUnit Tests. The Output of these Tests will be what you submit on ELMS for P0** <br>
We will also be using JUnit Tests in this class. Run the following commands to test that you can run and compile JUnit tests:

```bash
javac -cp "junit-4.10.jar:." TestHelloWorld.java 
java -cp "junit-4.10.jar:." org.junit.runner.JUnitCore TestHelloWorld
```

If you are on a Windows Machine, you may need to adjust the syntax:

```bash
javac -cp "junit-4.10.jar;." TestHelloWorld.java 
java -cp "junit-4.10.jar;." org.junit.runner.JUnitCore TestHelloWorld
```

## Academic Integrity

Please **carefully read** the academic honesty section of the course syllabus. **Any evidence** of impermissible cooperation on projects, use of disallowed materials or resources, or unauthorized use of computer accounts, **will be** submitted to the Student Honor Council, which could result in an XF for the course, or suspension or expulsion from the University. Be sure you understand what you are and what you are not permitted to do in regards to academic integrity when it comes to project assignments. These policies apply to all students, and the Student Honor Council does not consider lack of knowledge of the policies to be a defense for violating them. Full information is found in the course syllabus, which you should review before starting.
