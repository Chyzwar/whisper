

# Install Bootstrap 4 as submodule
git submodule init
git submodule update
npm install

# Build and copy bootstrap
grunt dist
cp -R lib/submodules/bootstrap/dist/ ./resources/public/bootstrap/

#Install and link npm deps
lein npm install
ln -s ../../lib/npm/node_modules/ ./resources/public