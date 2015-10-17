

# Install Bootstrap
git submodule init
git submodule update
npm install

grunt dist
cp -R lib/submodules/bootstrap/dist/ ./resources/public/bootstrap/

#Install Bower dependencies
lein bower install