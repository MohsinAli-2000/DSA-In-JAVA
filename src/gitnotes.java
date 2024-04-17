public class gitnotes {
    // To use git first we need to install in our systems.
    // To check whether its install or not type git in terminal & hit enter if a list of commands appear then its installed.
    // we use ls command to see all the list of files or folder in our current directory,
    // we use mkdir followed with [dir-name] to make a directory
    // we use cd followed with [dir-name] to move into the desire dir.
    // we use touch followed by file-name to create a file from cmd line
    // In git we have an repo named ".git" where all our project history is being stored.
    // To initialize git we run command : git init
    // To check the file within in this git folder we can run : ls .git
    // To check which files are in staged area we run command : git status
    // To add all the files of our current folder in staging area we run command : git add .
    // while we can also run command to add the files individually by their name : git add [file-name]
    // To commit the changes so that can be available globally we run : git commit -m "message"
    // we can run vi followed by file name to edit from cmd line : vi [file-name]
    // we can read the file by running : cat file-name
    // to remove the file from staging area we run the command : git restore --staged [file-name]
    // to see the whole history of our commits we run the command : git log
    // To delete a file we can run : rm -rf file-name
    // In git all the commits have a unique hash ID, they are made on the top of last one so if we want to switch towards the previous commit we will run : git reset COMMITS ID
    // In git we can also set files in a stash area where you can say that they are in back stage, to do  so we can run : git stash
    // Now if you will run git status you won't see them is staging area but they are in back stage.
    // To access all the files from stashing area we can run : git stash pop
    // If we want to clear our stashing area we can run : git stash clear >>>>> now we will unable to access them back!
    // To add a folder from remote we can run command : git remote add origin url
    /*
    Here above remote indicates that we are accessing or working with urls, add used to add while origin is your personal accound on github
     */
    // To access the urls that are currently attached to your repo you can run : git remote -v
    // To push your all commits you will run : git push origin master
    // To create a new branch you can run : git branch [branch-name]
    // To switch to that branch we can run : git checkout [branch-name]
    // Let say you are on the main branch and you need to merge anohter branch into it we can run : git merge [branch-name]
    // We forked the repo on github and then we can have code in our local machine by running : git clone [url]
    /*
    As we know that origin point towards our own account while to access or point to the account from where we have forked the repo we use the keyword 'upstream'
      >>>> we will run command : git remote add upstream [url]
     */
    // To delete an existing commit in remote repo we can run: git push origin main -f (Never make commits on main branch always use another branch)
    // To fetch all the changes form the upstream we can run : git fetch --all --prune
    // To make our forked branch as same to the upstream, after running fetch bracnh we will run : git reset --hard upstream/main
    // After that we will also need to push this by running : git push origin main
    // You can also do so by running this command : git pull upstream main

}
